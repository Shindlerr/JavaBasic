package Task_8;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cou = 0;
        /* for (int i = 0; i < n; i++) {
            if (!(i %2 == 0)) {
                cou += i;
            }
        } System.out.println(cou); */

        for (int i = 1; i < n; i+=2) {
            cou += i;
        } System.out.println(cou);

    }
}
