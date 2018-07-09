/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package java;

import java.io.Serializable;

/**
 *
 * @author g16947ur
 */
public class User implements Serializable {
    private String userId;
    private String pass;
    
    public User(){}
    public User(String userId, String pass){
        this.userId = userId;
        this.pass = pass;
    }

    public String getName(){ return userId; }
    public String getPass(){ return pass; }

}
