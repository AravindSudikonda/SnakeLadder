package com.bridgelabz.snakeladder;

import java.util.Random;

public class UC2snakeladder {

    public static void main(String[] args) {
        int postion = 0;
        Random ran = new Random();
        int dice = ran.nextInt(6)+1;
        System.out.println("dice: "+dice);
    }

}