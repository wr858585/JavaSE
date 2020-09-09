package com.atguigu.exer2;

/**
 * 用户数据操作接口
 * @author oono
 * @date 2020 09 09
 */
public interface UserDao {

    boolean login(String name, String password);
    void register(User user);
    User getUserByName(String name);


}
