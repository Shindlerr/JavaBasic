package Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result = (x + y + z) / 3;
        System.out.println(result);
        int round = result / 2;
        System.out.println(round);
        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
