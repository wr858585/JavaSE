package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Programmer extends Employee{

    //memberId：成员加入开发团队后，在团队中的ID
    private int memberId;

    //status：自定义枚举类，表示成员的状态
    private Status status;

    //equipment：该成员领用的设备
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public Programmer(int id, String name, int age, double salary, int memberId, Status status, Equipment equipment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus() + "\t" + equipment.getDescription();
    }
}
