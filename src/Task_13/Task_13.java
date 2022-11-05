package Task_13;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // "I love java 8 Я люблю java 14 core1" 0061 - 007A
        String allWords = sc.nextLine();
        char[] letArray;
        String[] newArray = allWords.toLowerCase().split(" ");
        int count = 0;

        for (int i = 0; i < newArray.length; i++) {
            letArray = newArray[i].toCharArray();
            for (int j = 0; j < letArray.length; j++) {
                if (letArray[j] < '\u0061' || letArray[j] > '\u007A') {
                    break;
                } else if (j == letArray.length - 1) {
                    System.out.println(newArray[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
