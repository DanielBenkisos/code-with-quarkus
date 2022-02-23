package com.example.repositories;

import com.example.domain.Email;
import com.example.domain.Password;
import com.example.domain.User;
import com.example.domain.Username;

import java.util.ArrayList;
import java.util.Collection;

public class UserRepository {
    private Collection<User> userList;

    public UserRepository(){
        userList = new ArrayList<User>();
    }

    public User create(Email email, Username username, Password password){
        int generatedId = userList.size() + 1;
        User user = new User(generatedId, email, password, username);
        userList.add(user);
        return user;
    }
}
