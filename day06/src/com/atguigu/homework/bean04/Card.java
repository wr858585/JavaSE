package com.atguigu.homework.bean04;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Card {

    public static void main(String[] args) {
        Card test = new Card("黑桃","A");
        test.showCard();
    }

    String shape;
    String num;

    public Card(){

    }
    public Card(String shape, String num){
        this.shape = shape;
        this.num = num;
    }

    public void showCard(){
        System.out.println(shape + num);
    }



}
