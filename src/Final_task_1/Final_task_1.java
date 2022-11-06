package Final_task_1;

import java.util.Scanner;

public class Final_task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара:");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Серьёзно? Где вы видели такой курс?");
        } else {
            System.out.println("Введите сумму в рублях:");
            double b = sc.nextDouble();
            double c = b / a;
            System.out.println("- Курс доллара: " + a);
            System.out.println("- Количество рублей: " + b);
            System.out.printf("- Итого: " + "%.2f", c);
            System.out.println(" долларов");
        }
    }
}
