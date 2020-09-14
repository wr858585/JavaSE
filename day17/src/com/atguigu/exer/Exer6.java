package com.atguigu.exer;

import java.util.*;

/**
 * @author oono
 * @date 2020 09 13
 */
public class Exer6 {

    public static void main(String[] args) {

        Map<String,List<People>> map = new HashMap<>();

        People p1 = new People("刘备",11);
        People p2 = new People("bb",15);
        People p3 = new People("cc",16);
        People p4 = new People("dd",12);

        People p5 = new People("关羽",11);
        People p6 = new People("ee",15);
        People p7 = new People("ff",16);
        People p8 = new People("gg",12);

        People p9 = new People("孙权",11);
        People p10 = new People("hh",15);
        People p11 = new People("ii",16);
        People p12 = new People("jj",12);

        List<People> list = new ArrayList<>();
        list.add(p1);//组长
        list.add(p2);
        list.add(p3);
        list.add(p4);
        List<People> list1 = new ArrayList<>();
        list1.add(p5);//组长
        list1.add(p6);
        list1.add(p7);
        list1.add(p8);
        List<People> list2 = new ArrayList<>();
        list2.add(p9);//组长
        list2.add(p10);
        list2.add(p11);
        list2.add(p12);

        map.put(list.get(0).getName(),list);
        map.put(list1.get(0).getName(),list1);
        map.put(list2.get(0).getName(),list2);

        for (Map.Entry<String,List<People>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<People> value = entry.getValue();
            System.out.println(key + "组：" + value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的组员名字：");
        String name = sc.next();

        Set<Map.Entry<String, List<People>>> entries = map.entrySet();
        boolean isExist = false;

        for (Map.Entry<String, List<People>> entry : entries) {
            List<People> groups = entry.getValue();
            for (People people : groups) {
                if(name.equals(people.getName())){
                    System.out.println(name + "在" + entry.getKey() + "组中");
                    isExist = true;
                    break;
                }
            }
        }
        if(!isExist){
            System.out.println(name + "并不在任何组中");
        }


//        map.put(p1.name,p1);
//        map.put(p1.name,p2);
//        map.put(p1.name,p3);
//        map.put(p1.name,p4);

//        Set<Map.Entry<String,People>> entries = map.entrySet();
//
//        Set<Map.Entry<String,List<People>>> entries = map.entrySet();
//        Set<String> keys = map.keySet();
//
//        for(Map.Entry<String,List<People>> e : entries){
//            String key = e.getKey();
//            List<People> value = e.getValue();
//            System.out.println(key + "组：" + value);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入名字：");
//        String name = sc.next();

//        if(){
//            System.out.println("该成员在这个组中");
//        }else{
//            System.out.println("不在该组");
//        }

//        Iterator<Map.Entry<String,List<People>>> it = entries.iterator();
//        boolean flag = true;
//        while(it.hasNext()){
//            Map.Entry<String, List<People>> entry = it.next();
//            String key = entry.getKey();
//            if(name.equals(key)){
//                System.out.println("该成员在这个组");
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("该成员不在这个组");
//        }

    }

}

class People{

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (age != people.age) return false;
        return name != null ? name.equals(people.name) : people.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }
}