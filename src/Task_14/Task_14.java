package Task_14;

import java.util.Random;
import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int[] newArray = new int[15];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(-20, 21);
            System.out.print("[" + (i + 1) + ": " + newArray[i] + "]; ");
        }
        System.out.println();
        int maxNum = newArray[0];
        for (int j : newArray) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println("Максимальное значение: " + maxNum);

        int minNum = newArray[0];
        for (int z : newArray) {
            if (z < minNum) {
                minNum = z;
            }
        }
        System.out.println("Минимальное значение: " + minNum);

        System.out.println("Максимальное значение по модулю: " + Math.max(Math.abs(maxNum), Math.abs(minNum)));


    }
}
