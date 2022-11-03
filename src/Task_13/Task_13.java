package Task_13;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String allWords = sc.nextLine();

        // "I love java 8 Я люблю java 14 core1"

        String[] newArray = allWords.split(" ");

        /* for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }*/
        for (int i = 0; i < newArray.length; i++) {
            int result;
            result = newArray[i].compareTo(i);
        }

    }
}
