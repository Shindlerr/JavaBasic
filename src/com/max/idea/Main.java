package com.max.idea;

public class Main {
    public static void main(String[] args) {
        // Task 1
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
        newArray[4] = last;

        System.out.println(newArray[0] + newArray[2]);
    }
}
