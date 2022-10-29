package Task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int [] newArray = {1, 4, 6, 12, 5};
        int last = newArray[0];
        newArray[0] = newArray[4];
        newArray[newArray.length - 1] = last;
        System.out.println(newArray[0] + newArray[newArray.length / 2]);
    }
}
