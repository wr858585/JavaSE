package com.atguigu.homework.bean03;

/**
 * @author oono
 * @date 2020 08 31
 */
public class MyDate {

    public static void main(String[] args) {
        MyDate test = new MyDate(1991, 4, 29);
        MyDate test1 = new MyDate(2004, 4, 29);
        test.showDate();
        boolean leapYear = test.isLeapYear();
        System.out.println(leapYear);
        test1.showDate();
        boolean leapYear1 = test1.isLeapYear();
        System.out.println(leapYear1);
    }

    int year, month, date;

    public MyDate() {

    }

    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void showDate() {
        System.out.println("year=" + year + ",month=" + month + ",date=" + date);
    }

    public boolean isLeapYear() {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
