package com.example.resources;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.example.domain.User;
import com.example.resources.dto.CreateUserDTO;
import com.example.services.requests.CreateUserServiceRequest;
import com.example.resources.dto.UserDTO;
import com.example.services.UserService;
import com.example.services.responses.CreateUserServiceResponse;
import org.jboss.logging.Logger;

@Path("/users")
public class UserResource {
    private final UserService userService = new UserService();

    @Inject
    Logger logger;

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public UserDTO createUser(CreateUserDTO createUserDTO) {
        logger.info("starting create user");
        logger.info("create userServiceRequest");

        CreateUserServiceRequest cusr = new CreateUserServiceRequest(
                createUserDTO.getEmail(),
                createUserDTO.getUsername(),
                createUserDTO.getPassword());
        logger.info("create userServiceRequest done");

        logger.info("starting create user");
        CreateUserServiceResponse response = userService.CreateUser(cusr);
        logger.info("create user done");

        logger.info("starting create userDTO");
        UserDTO userDTO = new UserDTO(
                "" + response.getUser().getId(),
                response.getUser().getEmail().getEmail(),
                response.getUser().getUsername().getUsername(),
                response.getUser().getPassword().getPassword());
        logger.info("create userDTO done");
       return userDTO;
    }
}
