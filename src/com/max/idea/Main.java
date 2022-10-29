package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* // Task 1
        System.out.println("Hello World!");

        // Task 2
        float a = 123.456f;
        byte b = 127;
        System.out.println(a);
        System.out.println(b);

        // Task 3
        int [] newArray = {1, 4, 6, 12, 5};
        int last = newArray[0];
        newArray[0] = newArray[4];
        newArray[newArray.length - 1] = last;

        System.out.println(newArray[0] + newArray[newArray.length / 2]);
        */
        //Task 4


        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
       // int num[] = {x, y, z};
        int result = (x + y + z) / 3;
        //System.out.println(result);
        int round = result / 2;
        //System.out.println(round);
        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }

        //Task 5

        /* int af = sc.nextInt();
        int bf = sc.nextInt();
        String sign = sc.next();
        switch (sign) {
            case "+":System.out.println(af + bf);
                break;
            case "-": System.out.println(af - bf);
                break;
            case "*": System.out.println(af * bf);
                break;
            case "/": System.out.println(af / bf);
                break;
        } */








    }
}




