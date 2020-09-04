package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Demo2 {

}

class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double earning(){
        return 0;
    }
    public String getInfo(){
        return name + "赚了" + earning();
    }
}

class SalaryEmployee extends Employee{

    public SalaryEmployee(String name, double salary, int workDays, int offDays){
        super(name);
        this.salary = salary;
        this.workDays = workDays;
        this.offDays = offDays;
    }

    double salary;
    int workDays;
    int offDays;
    @Override
    public double earning(){
        return salary - salary / workDays * offDays;
    }
}

class HourEmployee extends Employee{
    private double hourlyRate;
    private double workHours;
    public HourEmployee(String name, double hourlyRate, double workHours){
        super(name);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
    @Override
    public double earning(){
        return hourlyRate * workHours;
    }
}

class Manager extends SalaryEmployee{
    private double commissionPer;
    public Manager(String name,double salary, int workDays, int offDays, double commissionPer){
        super(name,salary,workDays,offDays);
        this.commissionPer = commissionPer;
    }
    @Override
    public double earning(){
        return ( salary / workDays * offDays) * (1 + commissionPer);
    }
}