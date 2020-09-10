package com.atguigu.team.service;

import com.atguigu.team.domain.*;
import javafx.scene.shape.Arc;
import org.junit.Test;
import org.w3c.dom.NameList;

/**
 * @author oono
 * @date 2020 09 09
 */
public class NameListService {

    //employees用来保存所有公司员工对象
    private Employee[] employees = new Employee[Data.EMPLOYEES.length];
    Equipment[] equipments = new Equipment[Data.EQUIPMENTS.length - 1];

    public NameListService(){

        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            switch(Data.EMPLOYEES[i][0]){
                case "10":
                    employees[i] = new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.valueOf(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]));
                    break;
                case "11":
                    employees[i] = new Programmer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.valueOf(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]));
                    break;
                case "12":
                    employees[i] = new Designer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.valueOf(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]),Double.parseDouble(Data.EMPLOYEES[i][5]));
                    break;
                case "13":
                    employees[i] = new Architect(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.valueOf(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]),Double.parseDouble(Data.EMPLOYEES[i][5]),Integer.parseInt(Data.EMPLOYEES[i][6]));
            }
        }

        for (int i = 1; i < Data.EQUIPMENTS.length; i++) {
            switch(Data.EQUIPMENTS[i][0]){
                case "21":
                    equipments[i - 1] = new PC(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
                    break;
                case "22":
                    equipments[i - 1] = new NoteBook(Data.EQUIPMENTS[i][1],Double.parseDouble(Data.EQUIPMENTS[i][2]));
                    break;
                case "23":
                    equipments[i - 1] = new Printer(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
            }
        }

        for (int i = 1; i < employees.length; i++) {
            Programmer programmer = (Programmer)employees[i];
            programmer.setEquipment(equipments[i - 1]);
        }
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("未找到指定员工");
    }

    public static void main(String[] args) {

        NameListService test = new NameListService();

        Employee[] allEmployees = test.getAllEmployees();

        for (Employee e : allEmployees){
            System.out.println(e);
        }

    }
}
