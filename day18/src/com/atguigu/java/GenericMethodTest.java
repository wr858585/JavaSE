package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 14
 */
public class GenericMethodTest {

    public static void main(String[] args) {

        People<Double> p1 = new People<>("小小",87.0,"男");
        //自动返回和形参相同的数据
        Integer info = p1.getInfo(88);
        String info1 = p1.getInfo("是我的成绩");
        System.out.println(info + info1);//88是我的成绩


    }

}

class People<T>{

    //泛型方法
    //目的：使返回值类型和形参类型相同
    public <A> A getInfo(A a){
        return a;
    }

    private String name;
    private T score;
    private String gender;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People(String name, T score, String gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }
}