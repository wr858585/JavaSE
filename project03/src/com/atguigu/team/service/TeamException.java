package com.atguigu.team.service;

/**
 * @author oono
 * @date 2020 09 10
 */
public class TeamException extends RuntimeException{

    public static final long serialVersionUID = 1212391271235678l;

    public TeamException(){

    }
    public TeamException(String message){
        super(message);
    }

}
