package com.example.realtimedatabase;

public class User {
    private String name, email,username,password, userId;

    public User() {
    }

    public User(String name, String email, String username, String password, String userId) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userId = userId;
    }

    public String getName() {
        return name;
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

    public String getUserId() {
        return userId;
    }
}
