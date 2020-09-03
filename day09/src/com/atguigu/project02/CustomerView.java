package com.atguigu.project02;

/**
 * @author oono
 * @date 2020 09 02
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    boolean loopFlag = true;

    public void enterMainMenu() {
        do {
            System.out.println("---------------------客户信息管理系统---------------------");
            System.out.println("                     1 添 加 客 户");
            System.out.println("                     2 修 改 客 户");
            System.out.println("                     3 删 除 客 户");
            System.out.println("                     4 客 户 列 表");
            System.out.println("                     5 退      出");
            System.out.println();
            System.out.println("                     请选择（1-5）：");
            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                case '4':
                    listAllCustomers();
                case '5':
                    System.out.println("确认是否退出（Y/N）：");
                    char confirm = CMUtility.readChar();
                    if (confirm == 'Y') {
                        loopFlag = false;
                        break;
                    }
            }
        } while (loopFlag);
    }

    private void addNewCustomer() {
        System.out.println("------------------------------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(20);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(20);
        System.out.println("邮箱：");
        String email = CMUtility.readString(40);

        //把新加的客户信息封装到对象中
        Customer addedCustomer = new Customer(name, gender, age, phone, email);

        //把该对象添加到数组中
        boolean flag = customerList.addCustomer(addedCustomer);
        if (flag) {
            System.out.println("-----------------添加成功----------------");
        } else {
            System.out.println("添加失败");
        }
    }

    private void modifyCustomer() {
        System.out.println("-----------------修改客户--------------------");
        System.out.println("请选择待修改客户编号（-1退出）：");
        int id = CMUtility.readInt();
        if (id == -1) {
            return;//return用来跳出当前方法
        }

        Customer customer = null;
        //无限循环
        for (; ; ) {
            //判断此编号客户是否存在
            id = CMUtility.readInt();
            customer = customerList.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }

        //获取新对象的信息
        System.out.println("姓名（" + customer.getName());
        String name1 = CMUtility.readString(20, customer.getName());
        System.out.println("性别（" + customer.getGender());
        char c1 = CMUtility.readChar(customer.getGender());
        System.out.println("年龄（" + customer.getGender());
        int age1 = CMUtility.readInt(customer.getAge());
        System.out.println("电话（" + customer.getGender());
        String phone1 = CMUtility.readString(20, customer.getPhone());
        System.out.println("邮箱（" + customer.getGender());
        String email1 = CMUtility.readString(40, customer.getEmail());

        //把用户信息封装成对象
        Customer cust = new Customer(name1, c1, age1, phone1, email1);

        boolean flag1 = customerList.replaceCustomer(id - 1, cust);

        if (flag1) {
            System.out.println("修改完成");
        } else {
            System.out.println("修改失败");
        }
    }

    private void deleteCustomer() {

    }

    private void listAllCustomers() {
        System.out.println("---------------客户列表-----------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        Customer[] allCustomers = customerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            System.out.println(i + 1 + "\t" + allCustomers[i].getName() + "\t" + allCustomers[i].getGender() + "\t"
                    + allCustomers[i].getAge() + "\t" + allCustomers[i].getPhone() + "\t" + allCustomers[i].getEmail());
        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
    }
}


