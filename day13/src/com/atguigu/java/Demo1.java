package com.atguigu.java;

import org.junit.Test;

/**
 * @author oono
 * @date 2020 09 08
 */
public class Demo1 {

    @Test
    public void testIsEmpty() {

        String s = "abc";
        String s1 = null;
        String s2 = "";

        boolean empty = s.isEmpty();
        System.out.println(empty);//false

//        boolean empty1 = s1.isEmpty();
//        System.out.println(empty1);//NullPointerException

        boolean empty2 = s2.isEmpty();
        System.out.println(empty2);//true

    }

    @Test
    public void testLength() {

        String s = "abc";

        int length = s.length();
        System.out.println("length = " + length);//length = 3

    }

    @Test
    public void testConCat() {

        String s = "花岗岩";
        String s1 = "不是大理石";
        String s2 = s.concat(s1);
        System.out.println("s2 = " + s2);//s2 = 花岗岩不是大理石

    }

    @Test
    public void testEquals() {

        String s = "大理石";
        String s1 = "花岗岩";
        System.out.println(s.equals(s1));//false

    }

    @Test
    public void testEqualsIgnoreCase() {

        String s = "Tom Scarvo";
        String s1 = "Tom SCARVO";

        System.out.println(s.equalsIgnoreCase(s1));//true

    }

    @Test
    public void testToUpperCase() {

        String s = "Tom";
        System.out.println(s.toUpperCase());//TOM
        System.out.println(s.toLowerCase());//tom

    }

    @Test
    public void testTrim() {

        String s = " hell o wor ld ";
        System.out.println(s.length());//15
        System.out.println(s.trim());//hell o wor ld\
        System.out.println(s.length());//15
        String s1 = s.trim();
        System.out.println(s1.length());//13

        //注意，trim()方法会返回一个源字符串的copy，所以不会对源字符串做出任何修改
        //作用：删除字符串中的前导空白和尾部空白

    }

    @Test
    public void testContains() {

        String s = "美丽的石灰岩";
        System.out.println(s.contains("的石灰"));//true

    }

    @Test
    public void testIndexOf() {

        String s = "美丽的石灰岩和石灰们啊";

        int index = s.indexOf("石灰");
        System.out.println("index = " + index);//index = 3

        int index1 = s.indexOf("石灰", 4);
        System.out.println("index1 = " + index1);//index1 = 7

        //indexOf(String str)会查找出字串str在被调用字符串中第一次出现的索引，如果没有找到返回一个负数，一般是-1
        //indexOf(String str, int beginIndex, int endIndex)会查找在[beginIndex,endIndex)范围区间内的字符串子串在原字符串的位置

    }

    @Test
    public void testLastIndexOf() {

        String s = "美丽的石灰岩和石灰们啊";

        int index = s.lastIndexOf("石灰");
        System.out.println("index = " + index);//index = 7

        //lastIndexOf(String str)会返回倒着数第一个出现该子串str的索引位置，且索引位置为str子串的第一个元素的索引
    }

    @Test
    public void testSubstring() {

        String s = "美丽的石灰岩和石灰们啊";

        String substring = s.substring(3);
        System.out.println("substring = " + substring);//substring = 石灰岩和石灰们啊

        String substring1 = s.substring(3, s.length() - 1);
        System.out.println("substring1 = " + substring1);//substring1 = 石灰岩和石灰们

        //左闭右开，所以不包含“啊”

    }

    @Test
    public void testCharAt() {

        String s = "hello java";

        char c = s.charAt(1);
        System.out.println("c = " + c);//c = e

    }

    @Test
    public void testToCharArray() {

        String s = "abc";
        char[] chars = s.toCharArray();

        System.out.println(chars);//abc

        //注意，这里虽然chars是引用数类，但是不会打印它的地址，而是值abc，因为println()源码对于char[]的重载写的不一样

    }

    @Test
    public void testString(){

        char[] chars = {'a','b'};
        String s = new String(chars);

        System.out.println("s = " + s);//s = ab

        //这其实是String的重载构造器
    }

    @Test
    public void testValueOf(){

        String s = String.valueOf(123);
        System.out.println("s = " + s);//s = 123]

        //String类的静态方法valueOf，把各种基本数类转换为String就用这个String.valueOf()的各种重载

    }

    @Test
    public void testGetBytes(){

        String s = "abc";

        byte[] bytes = s.getBytes();
        System.out.println("bytes = " + bytes);

        for(Byte e : bytes){
            System.out.println(e);
        }

    }

    /*
    编码和解码：
    1. 编码：把可看懂的String变成各种看不懂的byte字节等 --> getBytes()方法
    2. 解码：把各种看不懂的byte字节等转成能看懂的String --> String(Byte[] bytes)构造器
     */

    @Test
    public void testStartWith(){

        String s = "美丽的石灰岩和石灰们啊";

        System.out.println(s.startsWith("石灰们啊"));//false
        System.out.println(s.endsWith("石灰们啊"));//true

    }

    @Test
    public void testReplace(){

        String s = "美丽的石灰岩和石灰们啊";

        String replace = s.replace("们", "哈哈");
        System.out.println("s = " + s);//s = 美丽的石灰岩和石灰们啊
        System.out.println("replace = " + replace);//replace = 美丽的石灰岩和石灰哈哈啊

        //同样，replace()方法也不会修改原来的str，只是会把修改后的结果return成str1

    }

    @Test
    public void testSplit(){

        String s = "美丽的石灰岩和石灰们啊";

        String[] str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            System.out.println(str[i]);
        }


    }
}

