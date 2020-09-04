package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Bank {

    private Customer[] customers;

    private int numberOfCustomers;

    public Bank(int numberOfCustomers){
        customers = new Customer[numberOfCustomers];
    }

    public void addCustomer(String f, String l){
        customers[numberOfCustomers++] = new Customer(f,l);
    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }


}
