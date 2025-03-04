package edu.neumont.mgt101.model;

public class User {
    private String username;
    private String password;

    public User(String name, String password) {
        setUsername(name);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
