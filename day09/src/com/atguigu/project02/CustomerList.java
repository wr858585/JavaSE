package com.atguigu.project02;

import org.junit.Test;

/**
 * @author oono
 * @date 2020 09 02
 */
public class CustomerList {

    private Customer[] customers;
    private int total = 0;//实际的客户人数

    //构造器
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加客户功能
     *
     * @param customer 要添加的客户
     * @return 添加成功：true 添加失败：false
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        } else {
            System.out.println("人数已满，无法添加");
            return false;
        }
    }

    /**
     * 替换指定索引位置的客户对象
     *
     * @param index 数组中要替换的所以i你位置
     * @param cust  要替换的新客户对象
     * @return true：添加成功 false：添加失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            System.out.println("为找到指定客户");
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }

    /**
     * 删除指定索引的客户对象
     *
     * @param index 要删除的客户在数组中的索引位置
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            System.out.println("未找到指定客户");
            return false;
        } else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[--total] = null;
            return true;
        }
    }

    /**
     * 获取所有当前客户对象
     *
     * @return Customer[] currentCustomers：返回一个包含所有当前客户对象的数组
     */
    public Customer[] getAllCustomers() {
        Customer[] currentCustomers = new Customer[total];
        for (int i = 0; i < currentCustomers.length; i++) {
            currentCustomers[i] = customers[i];
        }
        return currentCustomers;
    }

    /**
     * 获取指定索引位置的客户对象
     *
     * @param index 指定的索引位置
     * @return Customer customers[index]：返回指定的对象
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            System.out.println("未找到指定客户");
            return null;
        } else {
            return customers[index];
        }
    }

    public static void main(String[] args) {
        CustomerList list = new CustomerList(5);
        Customer c1 = new Customer("大理石", '男', 22, "1300222222", "12312@qq.com");
        Customer c2 = new Customer("花岗岩", '女', 22, "1300222422", "12311123492@qq.com");
        list.addCustomer(c1);
        list.addCustomer(c2);
        Customer[] allCustomers = list.getAllCustomers();
        boolean b = list.replaceCustomer(3, c2);
        System.out.println(b);
        for (Customer customer : allCustomers) {
            System.out.println(customer.getName() + "=" + customer.getAge());
        }
    }
}
