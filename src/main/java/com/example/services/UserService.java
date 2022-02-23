package com.example.services;

import com.example.domain.User;
import com.example.repositories.UserRepository;
import com.example.services.requests.CreateUserServiceRequest;
import com.example.services.responses.CreateUserServiceResponse;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public CreateUserServiceResponse CreateUser(CreateUserServiceRequest cusr){
        return new CreateUserServiceResponse(userRepository.create(cusr.getEmail(), cusr.getUsername(), cusr.getPassword()));
    }
}
