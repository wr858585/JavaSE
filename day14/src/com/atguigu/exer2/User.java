package com.atguigu.exer2;

/**
 * User类：用来封装用户数据
 * @author oono
 * @date 2020 09 09
 */
public class User {

    private String username;
    private String password;

    public User(){

    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
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
