package Task_6;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int weiDis, measure;
    double coUnit;


    System.out.println("Выберите что переводить: 1 - масса; 2 - расстояние");
    weiDis = sc.nextInt();

        if (weiDis == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - пуд");
            measure = sc.nextInt();
            if (measure > 2) {
                System.out.println("Нет такого выбора");
            }
            System.out.println("Введите число");
            coUnit = sc.nextDouble();
            double kg, ft, un, pud;
            switch (measure) {
                case 1: kg = coUnit;
                        ft = coUnit * 2.2;
                        un = coUnit * 35.27;
                        pud = coUnit * 0.061;
                        System.out.println("Килограммы:" + " " + kg + '\n' +
                                            "Фунты:" + " " + ft + '\n' +
                                            "Унции:" + " " + un + '\n' +
                                            "Пуды:" + " " + pud + '\n');
                        break;
                case 2: kg = coUnit * 0.45;
                        ft = coUnit;
                        un = coUnit * 16;
                        pud = coUnit * 0.028;
                        System.out.println("Килограммы:" + " " + kg + '\n' +
                                            "Фунты:" + " " + ft + '\n' +
                                            "Унции:" + " " + un + '\n' +
                                            "Пуды:" + " " + pud + '\n');
                        break;
                case 3: kg = coUnit * 0.028;
                        ft = coUnit * 0.063;
                        un = coUnit;
                        pud = coUnit * 0.0017;
                        System.out.println("Килограммы:" + " " + kg + '\n' +
                                            "Фунты:" + " " + ft + '\n' +
                                            "Унции:" + " " + un + '\n' +
                                            "Пуды:" + " " + pud + '\n');
                        break;
                case 4: kg = coUnit * 16.38;
                        ft = coUnit * 36.11;
                        un = coUnit * 577.79;
                        pud = coUnit;
                        System.out.println("Килограммы:" + " " + kg + '\n' +
                                            "Фунты:" + " " + ft + '\n' +
                                            "Унции:" + " " + un + '\n' +
                                            "Пуды:" + " " + pud + '\n');
                        break;
            }

        } else if (weiDis == 2) {

                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                measure = sc.nextInt();
                System.out.println("Введите число");
                coUnit = sc.nextDouble();
                double mr, mil, yard, fut;
                switch (measure) {
                    case 1:
                        mr = coUnit;
                        mil = coUnit * 0.00062;
                        yard = coUnit * 1.09;
                        fut = coUnit * 3.28;
                        System.out.println("Метры:" + " " + mr + '\n' +
                                            "Мили:" + " " + mil + '\n' +
                                            "Ярды:" + " " + yard + '\n' +
                                            "Футы:" + " " + fut + '\n');
                        break;
                    case 2:
                        mr = coUnit * 1609.34;
                        mil = coUnit;
                        yard = coUnit * 16;
                        fut = coUnit * 1760;
                        System.out.println("Метры:" + " " + mr + '\n' +
                                            "Мили:" + " " + mil + '\n' +
                                            "Ярды:" + " " + yard + '\n' +
                                            "Футы:" + " " + fut + '\n');
                        break;
                    case 3:
                        mr = coUnit * 0.91;
                        mil = coUnit * 0.00057;
                        yard = coUnit;
                        fut = coUnit * 3;
                        System.out.println("Метры:" + " " + mr + '\n' +
                                            "Мили:" + " " + mil + '\n' +
                                            "Ярды:" + " " + yard + '\n' +
                                            "Футы:" + " " + fut + '\n');
                        break;
                    case 4:
                        mr = coUnit * 0.3;
                        mil = coUnit * 0.00019;
                        yard = coUnit * 0.33;
                        fut = coUnit;
                        System.out.println("Метры:" + " " + mr + '\n' +
                                            "Мили:" + " " + mil + '\n' +
                                            "Ярды:" + " " + yard + '\n' +
                                            "Футы:" + " " + fut + '\n');
                        break;
                }
        } else {
            System.out.println("Нет такого выбора");
        }

    }

}
