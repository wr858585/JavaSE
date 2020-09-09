package com.atguigu.team.domain;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Designer extends Programmer{

    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t" + getEquipment().getDescription();
    }
}
