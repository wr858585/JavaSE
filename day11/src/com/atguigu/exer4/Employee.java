package com.atguigu.exer4;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Employee implements Comparable<Employee>{

    private int id;
    private double salary;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee){
        if (Double.compare(employee.salary,salary) == 0){
            return Integer.compare(id, employee.id);
        }else{
            return Double.compare(salary, employee.salary);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
