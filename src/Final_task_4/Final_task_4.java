package Final_task_4;

import java.util.Scanner;

public class Final_task_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Отгадай закадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "Заархивированный вирус";
        String hint = "Подсказка";
        boolean help = false;

        for (int i = 1; i < 4; i++) {
            String a = sc.nextLine();
            switch (i) {
                case 1:
                    if (a.equals(answer)) {
                        System.out.println("Правильно!");
                        System.exit(1);
                    } else if (a.equals(hint)) {
                        System.out.println("COVID-19");
                        help = true;
                    } else if (!a.equals(answer)) {
                        System.out.println("Подумай ещё!");
                    }
                    break;
                case 2:
                    if (a.equals(answer)) {
                        System.out.println("Правильно!");
                        System.exit(1);
                    } else if (help) {
                        System.out.println("Обидно, приходи в другой раз");
                        System.exit(0);
                    } else if (a.equals(hint)) {
                        System.out.println("Подсказка уже недоступна");
                    } else if (!a.equals(answer)) {
                        System.out.println("Подумай ещё!");
                    }
                    break;
                case 3:
                    if (a.equals(answer)) {
                        System.out.println("Правильно!");
                        System.exit(1);
                    } else if (help) {
                        System.out.println("Обидно, приходи в другой раз");
                        System.exit(0);
                    } else if (a.equals(hint)) {
                        System.out.println("Подсказка уже недоступна");
                    } else if (!a.equals(answer)) {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                    break;
            }
        }
    }
}
