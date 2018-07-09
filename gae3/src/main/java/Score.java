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
public class Score implements Serializable{
    
    private String userId;
    //private String pass;
    //private String name;
    private String score;
    
    public Score(){}
    public Score(String userId,String score){
        this.userId = userId;
        //this.pass = pass;
        //this.name = name;
        this.score = score;
    }
    public String getUserId(){return userId;}
    //public String getPass(){return pass;}
    //public String getName(){return name;}
    public String getScore(){ return score; }
}


