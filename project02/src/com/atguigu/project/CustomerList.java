package com.atguigu.project;

/**
 * @author oono
 * @date 2020 09 02
 */
public class CustomerList {

    //先声明数组，否则各个方法中获取不到，不能形成关联
    Customer[] customers;
    //记录实际客户的数量
    int total;

    /**
     * 构造器：对Customer[]数组进行初始化
     * @param totalCustomer：设置总客户数（即数组的容量，能够装的下的最多人数）
     */
    public CustomerList(int totalCustomer){
        //创建一个数组，用于保存Customer类的实例对象
        customers = new Customer[totalCustomer];
    }

    /**
     * 增-方法：添加一个Customer类的实例到数组中
     * @param customer：要添加的Customer类的实例
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            System.out.println("数组容量已满，添加失败:<");
            return false;
        }else{
            customers[total++] = customer;
            return true;
        }
    }

    /**
     * 改-方法：把指定索引位置的客户改成形参Customer实例
     * @param index：指定的索引
     * @param customer：要替换成的客户实例
     * @return true：更改成功 false：更改失败
     */
    public boolean replaceCustomer(int index, Customer customer){
        if(index < 0 || index >= total){
            System.out.println("为找到指定客户，操作失败:<");
            return false;
        }else{
            customers[index] = customer;
            return true;
        }
    }

    /**
     * 删-方法：把指定索引位置的元素删除
     * @param index：指定的索引
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            System.out.println("为找到指定客户，操作失败:<");
            return false;
        }else{
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[--total] = null;
            return true;
        }
    }

    /**
     * 得到实际的客户，返回一个没有null的数组
     * @return 实际Customer对象数组
     */
    public Customer[] getAllCustomers(){
        Customer[] currentCustomers = new Customer[total];
        for (int i = 0; i < currentCustomers.length; i++) {
            currentCustomers[i] = customers[i];
        }
        return currentCustomers;
    }

    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            System.out.println("为找到指定客户，操作失败:<");
            //若找不到，也要return语句返回null，否则不符合public Customer getCustomer(int index)有返回值的规定
            return null;
        }else {
            return customers[index];
        }
    }

    public static void main(String[] args) {
        CustomerList test = new CustomerList(5);
        test.addCustomer(new Customer("大理石",'m',10,"12312312312","12312"));
        test.addCustomer(new Customer("花岗岩",'f',10,"123123312","1231333222"));
        Customer[] allCustomers = test.getAllCustomers();
        for (Customer cust : allCustomers){
            System.out.println(cust.age + cust.gender + cust.name);
        }
    }
}
