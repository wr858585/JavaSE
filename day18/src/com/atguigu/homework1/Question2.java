package com.atguigu.homework1;

import java.util.*;

/**
 * @author oono
 * @date 2020 09 14
 */
public class Question2 {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        List integers = Arrays.asList();
        System.out.println(integers);//[]

        map.put("浙江省",Arrays.asList("绍兴市","温州市","湖州市","嘉兴市"));

//        List<String> cities1 = new ArrayList<>();
//        cities1.add("绍兴市");
//        cities1.add("温州市");
//        cities1.add("湖州市");
//        cities1.add("嘉兴市");

        List<String> cities2 = new ArrayList<>();
        cities2.add("海口市");
        cities2.add("三亚市");

        List<String> cities3 = new ArrayList<>();
        cities3.add("北京市");

//        map.put("浙江省",cities1);
        map.put("湖南省",cities2);
        map.put("北京市",cities3);

        Set<Map.Entry<String,List<String>>> entries =  map.entrySet();

        Iterator<Map.Entry<String,List<String>>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String,List<String>> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }

}
