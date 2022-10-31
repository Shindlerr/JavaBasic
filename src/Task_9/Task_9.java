package Task_9;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        double[] newArray = new double[d];
        double sum = 0;
        double avg;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextDouble();
            sum += newArray[i];
        }
        avg = sum / d;
        System.out.print("[ ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] * avg + " ");
        }
        System.out.print("]");
    }
}
