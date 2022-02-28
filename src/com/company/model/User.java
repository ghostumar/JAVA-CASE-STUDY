package com.company.model;

/**
 * created user class
 * for user information
 * to log in
 */

public class User {
    private String userName;
    private String userEmail;
    public User(String userName,String userEmail){
        this.userName=userName;
        this.userEmail=userEmail;

    }

    /**
     * created accesor method
     * for each instance variable for users.
     * @return
     */

    public String getUserName() {
        return userName;
    }



    public String getUserEmail() {
        return userEmail;
    }

}
