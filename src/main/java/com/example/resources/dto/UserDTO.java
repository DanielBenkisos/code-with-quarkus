package com.example.resources.dto;

public class UserDTO {
    private String email;
    private String username;
    private String password;
    private String id;

    public UserDTO(String id, String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }
}
