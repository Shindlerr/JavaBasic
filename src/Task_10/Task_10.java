package Task_10;

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int e = sc.nextInt();
        int[][] newMatrix = new int[d][e];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < e; j++){
                System.out.println("Введите элемент [" + i + "]" + ":" + "[" + j +"]");
                newMatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < d; i++) {
            System.out.print(newMatrix[0][i] * 3 + " ");
        }
    }
}
