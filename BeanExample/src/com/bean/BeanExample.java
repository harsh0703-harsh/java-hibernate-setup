package com.bean;

import java.io.Serializable;

public class BeanExample implements Serializable {

    private String userId;
    private String password;

    private String username;

    private double balance;



    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUserId(){

        return userId;
    }

    public String getPassword(){

        return password;
    }



}
