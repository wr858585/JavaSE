package com.atguigu.project;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author oono
 * @date 2020 09 02
 */
public class CustomerView {

    //创建长度为10的Customer[]数组
    CustomerList customerList = new CustomerList(10);

    public void enterMenu(){

        boolean loopFlag = true;

        do {
            System.out.println("--------------客户信息管理系统--------------");
            System.out.println("              1. 添加客户");
            System.out.println("              2. 修改客户");
            System.out.println("              3. 删除客户");
            System.out.println("              4. 客户列表");
            System.out.println("              5. 退出");
            System.out.println();
            System.out.println("              请选择（1-5）：");

            int choice = CMUtility.readInt();
            switch (choice) {
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    modifyCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    getAllCustomers();
                    break;
                case 5:
                    System.out.println("确认退出吗(Y/N)：");
                    char confirm = CMUtility.readConfirmSelection();
                    if(confirm == 'Y') {
                        loopFlag = false;
                        break;
                    }
            }
        }while(loopFlag);
    }

    public void addNewCustomer(){

        System.out.println("--------------添加客户--------------");

        System.out.println("姓名：");
        String name = CMUtility.readString(5);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(20);
        System.out.println("邮箱：");
        String email = CMUtility.readString(40);

        //将从键盘获取的客户信息封装到一个Customer类型的实例newCustomer中
        Customer newCustomer = new Customer(name,gender,age,phone,email);

        //将这个封装好的新客户newCustomer放进Customer[]数组中
        customerList.addCustomer(newCustomer);

        System.out.println("--------------添加成功--------------");
    }

    public void modifyCustomer(){

        System.out.println("--------------修改客户--------------");

        //将用户要修改的customer编号记为id，如：第一个客户的编号是1
        int id;
        for(;;) {
            System.out.println("请选择待修改客户编号（-1退出）：");
            id = CMUtility.readInt();
            if (id == -1) {
                break;
            }else if (id < 1 || id > customerList.getAllCustomers().length){
                System.out.println("未找到指定客户，请重新输入：");
            } else{
                System.out.println("姓名(" + customerList.getCustomer(id - 1).name + ")：");
                String name = CMUtility.readString(5, customerList.getCustomer(id - 1).name);
                System.out.println("性别(" + customerList.getCustomer(id - 1).gender + ")：");
                char gender = CMUtility.readChar(customerList.getCustomer(id - 1).gender);
                System.out.println("年龄(" + customerList.getCustomer(id - 1).age + ")：");
                int age = CMUtility.readInt(customerList.getCustomer(id - 1).age);
                System.out.println("电话(" + customerList.getCustomer(id - 1).phone + ")：");
                String phone = CMUtility.readString(20,customerList.getCustomer(id - 1).phone);
                System.out.println("邮箱(" + customerList.getCustomer(id - 1).email + ")：");
                String email = CMUtility.readString(40,customerList.getCustomer(id - 1).email);

                //将修改后的值封装到一个新的Customer类型的实例中editCustomer
                Customer editCustomer = new Customer(name,gender,age,phone,email);

                //用CustomerList中的replaceCustomer()方法把封装好的editCustomer传入数组
                customerList.replaceCustomer(id -1, editCustomer);

                System.out.println("--------------修改完成--------------");
                break;
            }
        }
    }

    public void deleteCustomer() {

        System.out.println("--------------删除客户--------------");

        //将用户要修改的customer编号记为id，如：第一个客户的编号是1
        int id;
        for (; ; ) {
            System.out.println("请选择待删除客户编号（-1退出）：");
            id = CMUtility.readInt();
            if (id == -1) {
                break;
            } else if(id < 1 || id > customerList.getAllCustomers().length){
                System.out.println("未找到指定客户，请重新输入：");
            } else {
                System.out.println("确认是否删除(Y/N)：");
                char confirm = CMUtility.readConfirmSelection();
                if(confirm == 'Y') {
                    customerList.deleteCustomer(id - 1);
                    System.out.println("--------------删除完成--------------");
                    break;
                }
            }
        }
    }

    public void getAllCustomers(){

        System.out.println("--------------客户列表--------------");

        System.out.println("编号\t姓名\t\t性别\t年龄\t电话\t\t\t邮箱");

        Customer[] allCustomers = customerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            System.out.println(i + 1 + "\t" + allCustomers[i].name + "\t" + allCustomers[i].gender + "\t" + allCustomers[i].age
            + "\t" + allCustomers[i].phone + "\t" + allCustomers[i].email);
        }

        System.out.println("--------------客户列表完成--------------");
    }

    public static void main(String[] args) {

        CustomerView test = new CustomerView();

        test.enterMenu();
    }
}
