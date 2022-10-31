package Task_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        char res = sc.next().charAt(0);
        double b = sc.nextInt();
        switch (res) {
            case '+': System.out.println(a + b);
                    break;
            case '-': System.out.println(a - b);
                    break;
            case '*': System.out.println(a * b);
                    break;
            case '/': if (b == 0){
                        System.out.println("Делить на ноль? Ты в своём уме?");
                    } else System.out.println(a / b);
                    break;
            default: System.out.println("Не знаю таких операций");

        }

    }
}