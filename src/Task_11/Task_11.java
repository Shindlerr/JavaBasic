package Task_11;

import java.util.Random;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        int num2 = sc.nextInt();
        Integer num3 = Integer.valueOf(num1);
        System.out.println(Math.max(num2, num3));
        System.out.println(Math.min((double)num2, num3));
    }
}
