package com.atguigu.exer;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author oono
 * @date 2020 09 21
 */
public class EmployeeService {

    private ArrayList<Employee> all = new ArrayList<>();

    public EmployeeService(){
        all.add(new Employee(100,"Tom",'m',18,15000));
        all.add(new Employee(101,"Rom",'m',19,14000));
        all.add(new Employee(102,"Som",'f',16,17000));
        all.add(new Employee(103,"Qom",'f',17,18000));
        all.add(new Employee(104,"Aom",'m',27,28000));
        all.add(new Employee(105,"Bom",'f',27,28000));
    }

    public ArrayList<Employee> get(Predicate<Employee> p){
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : all) {
            if (p.test(employee)) {
                list.add(employee);
            }
        }
        return list;
    }

}
