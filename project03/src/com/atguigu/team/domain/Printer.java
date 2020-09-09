package com.atguigu.team.domain;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Printer implements Equipment{

    private String type;
    private String name;

    public Printer() {
    }

    public Printer(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription(){
        return name + "(" + type + ")";
    }
}
