package Task_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        String res = sc.next();
        switch (res) {
            case "+": System.out.println(a + b);
                    break;
            case "-": System.out.println(a - b);
                    break;
            case "*": System.out.println(a * b);
                    break;
            case "/": System.out.println(a / b);
                    break;
        }

    }
}