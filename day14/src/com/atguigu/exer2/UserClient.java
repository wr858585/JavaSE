package com.atguigu.exer2;

import java.util.Scanner;

/**
 * UserClient：模拟客户端
 * @author oono
 * @date 2020 09 09
 */
public class UserClient {

    public static void main(String[] args) {

        System.out.println("--------------吊炸天的客户系统0821--------------");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        //多态：解耦合
        //这个让耦合度大大降低了，比如之后谁去实现UserDao接口，无所谓，都不影响，可以随便去写新的，但是不用改我这里的代码，和接口UserDao的代码
        UserDao userDao = new UserDaoImpl();

        do {
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 退出");
            System.out.println("请选择(1-3)：");

            String key = sc.nextLine();

            switch (key) {
                case "1":
                    System.out.println("--------------登录界面--------------");
                    System.out.println("请输入用户名：");
                    String inputName = sc.nextLine();
                    System.out.println("请输入密码：");
                    String inputPassword = sc.nextLine();
                    //封装User类的对象
                    User inputUser = new User(inputName,inputPassword);
                    //把user对象和数组中的元素对比，判断是否登录成功
                    boolean success = userDao.login(inputName, inputPassword, inputUser);
                    if(success){
                        System.out.println("登录成功");
                    }else{
                        System.out.println("登录失败");
                    }
                    break;
                case "2":
                    System.out.println("--------------注册界面--------------");
                    System.out.println("请输入用户名：");
                    String name = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();
                    //添加一个步骤：首先，要判断是否这个用户名已经被注册，如果是true，则不用往下走了（不用封装，传输等等）
                    userDao.getUserByName(inputName);
                    //封装User类的对象
                    User user = new User(name, password);
                    //把user对象存放到User[]数组中
                    userDao.register(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                    System.out.println("--------------退出界面--------------");
                    flag = false;
            }
        }while(flag);
    }




}
