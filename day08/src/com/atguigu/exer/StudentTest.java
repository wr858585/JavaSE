package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 01
 */
public class StudentTest {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].name = "学生" + (i + 1);
            students[i].score = (int)(Math.random() * (100 - 0 + 1) + 1);
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if(students[j].score < students[j + 1].score){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        for (Student student : students){
            System.out.println(student.name + "," + student.score);
        }
    }



}
