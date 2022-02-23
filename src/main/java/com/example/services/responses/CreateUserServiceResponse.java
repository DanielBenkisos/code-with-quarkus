package com.example.services.responses;

import com.example.domain.User;

public class CreateUserServiceResponse {
    private final User user;

    public CreateUserServiceResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
