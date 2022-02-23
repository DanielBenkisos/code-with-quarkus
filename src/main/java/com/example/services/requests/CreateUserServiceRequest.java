package com.example.services.requests;

import com.example.domain.Email;
import com.example.domain.Password;
import com.example.domain.Username;

public class CreateUserServiceRequest {
    private Email email;
    private Username username;
    private Password password;

    public CreateUserServiceRequest(String email, String username, String password) {
        this.email = new Email(email);
        this.username = new Username(username);
        this.password = new Password(password);
    }

    public Email getEmail() {
        return email;
    }

    public Username getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }
}
