package com.atguigu.java2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 12
 */
public class MapTest {

    public static void main(String[] args) {

        Map map = new HashMap<>();

        //增
        //put(Object key, Object value)
        //putAll(Map other)
        map.put(101,"tom");
        map.put(111,"tom");
        map.put(101,"tom");
        map.put(102,"rose");

        System.out.println(map);

        Map map1 = new HashMap<>();
        map1.put(1,"你");
        map1.put(1,"我");//会覆盖掉原来的value，因为映射不能一对多
        map1.put(2,"你");

        System.out.println(map1);

        map.putAll(map1);
        System.out.println(map);

        //删
        //clear()
        //remove(Object key)
        //remove(Object key, Object value)
        Object remove = map.remove(111);
        boolean remove1 = map.remove(111, 111);
        System.out.println("remove = " + remove);
        System.out.println("remove1 = " + remove1);
        System.out.println(map);

        //查
        //get(Object key)
        //containsKey(Object key)
        //containsValue(Object value)
        //boolean isEmpty()
        Object o = map.get(101);
        System.out.println("o = " + o);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("rose"));
        System.out.println(map.isEmpty());

        //获取所有的key,value,entry
        //keySet(),values(),entrySet()

        Set set = map.keySet();
        System.out.println("set = " + set);

        Collection values = map.values();
        System.out.println("values = " + values);

        Set set1 = map.entrySet();
        System.out.println("set1 = " + set1);

        //长度
        //size()
        int size = map.size();
        System.out.println("size = " + size);

    }

}
