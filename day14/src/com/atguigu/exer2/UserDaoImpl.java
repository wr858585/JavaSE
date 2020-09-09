package com.atguigu.exer2;

/**
 * @author oono
 * @date 2020 09 09
 */
public class UserDaoImpl implements UserDao{

    private static User[] users = null;

    //使用静态代码块：可以先就创建一个系统默认的用户，用作测试账号管理账号等
    static
    {
        users = new User[10];
        users[0] = new User("默认用户","123");
    }

    /**
     * 登录功能
     * @param inputName
     * @param inputPassword
     * @param inputUser
     * @return
     */
    public static boolean login(String inputName, String inputPassword, User inputUser) {
        boolean success = false;
        for (int i = 0; i < users.length; i++) {
            if(inputName.equals(inputUser.getUsername()) && inputPassword.equals(inputUser.getPassword())){
                success = true;
                break;
            }
        }
        return success;
    }

    /**
     * 创建账号功能
     * @param user
     */
    public static void register(User user) {
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null){
                users[i] = user;
                break;
            }
        }
    }

    public User getUserByName(String name){
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                if (!(name.equals(users[i].getUsername())){
                    return users[i];//?
                }
            }
            return null;
        }
    }

}
