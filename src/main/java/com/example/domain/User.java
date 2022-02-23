package com.example.domain;

public class User {
    private Email email;
    private Password password;
    private Username username;
    private int id;

    public User(int id, Email email, Password password, Username username){
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Username getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
