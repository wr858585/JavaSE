package com.atguigu.homework.bean02;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Circle {

        private double radius;

        public Circle(){

        }
        public Circle(double radius){
            this. radius = radius;
        }

        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }

        public double getPerimeter(double radius){
            return 2 * Math.PI * radius;
        }
}
