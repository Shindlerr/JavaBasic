package Final_task_2;

import java.util.Scanner;

public class Final_task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите уравнение с одной переменной:");
        String a = sc.next();
        char[] newArray = new char[5];
        newArray = a.toCharArray();

        boolean b = (newArray[0] >= '0' && newArray[0] <= '9') || newArray[0] == 'x';
        boolean c = newArray[1] == '-' || newArray[1] == '+';
        boolean d = (newArray[2] >= '0' && newArray[2] <= '9') || newArray[2] == 'x';
        boolean e = newArray[3] == '=';
        boolean f = (newArray[4] >= '0' && newArray[4] <= '9') || newArray[4] == 'x';

        if (b && c && d && e && f) {
            if ((newArray[0] == 'x') && (newArray[2] != 'x' || newArray[4] != 'x')) {
                switch (newArray[1]) {
                    case '+':
                        System.out.println(Character.getNumericValue(newArray[4]) - Character.getNumericValue(newArray[2]));
                        break;
                    case '-':
                        System.out.println(Character.getNumericValue(newArray[4]) + Character.getNumericValue(newArray[2]));
                        break;
                    default:
                        System.out.println("Это мы не проходили, это нам не задавали!");
                }
            }
            if (newArray[2] == 'x') {
                switch (newArray[1]) {
                    case '+':
                        System.out.println(Character.getNumericValue(newArray[4]) - Character.getNumericValue(newArray[0]));
                        break;
                    case '-':
                        System.out.println(Character.getNumericValue(newArray[0]) - Character.getNumericValue(newArray[4]));
                        break;
                    default:
                        System.out.println("Это мы не проходили, это нам не задавали!");
                }
            }
            if (newArray[4] == 'x') {
                switch (newArray[1]) {
                    case '+':
                        System.out.println(Character.getNumericValue(newArray[0]) + Character.getNumericValue(newArray[2]));
                        break;
                    case '-':
                        System.out.println(Character.getNumericValue(newArray[0]) - Character.getNumericValue(newArray[2]));
                        break;
                    default:
                        System.out.println("Это мы не проходили, это нам не задавали!");
                }
            }
        }
        else {
            System.out.println("Ошибочка вышла. Попробуй ещё!");
        }
    }
}
