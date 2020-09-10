package com.atguigu.team.domain;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Architect extends Designer{

    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.getDetails() + "\t架构师\t" + getStatus() + "\t" + super.getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getPosition(){
        return "架构师";
    }
}
