/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package model;


import java.io.Serializable;

/**
 *
 * @author uchiokerika
 */
public class Account implements Serializable{
    
    private String userId;
    private String pass;
    private String name;
    
    public Account(){}
    public Account(String userId, String pass, String name){
        this.userId = userId;
        this.pass = pass;
        this.name = name;
    }
    public String getUserId(){return userId;}
    public String getPass(){return pass;}
    public String getName(){return name;}
}
