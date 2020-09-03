package com.atguigu.java1;

/**
 * POJO：比JavaBean更单纯的承载数据的类 Plain Ordinary Java Object（只有纯属性、构造器、getter&setter，没了）
 * JavaBean：除了承载数据，还可以有一些业务逻辑（除了POJO，还有一些自己的方法）
 * @author oono
 * @date 2020 09 01
 */
public class JavaBean {
    private String userName;
    private String password;
    private String gender;

    public JavaBean(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
