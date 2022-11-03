package Task_12;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean a = false;
        boolean b = false;
        boolean c = false;
        String fraza = sc.nextLine();
        //"I like Java!!!"
        a = fraza.contains("Java");
        b = fraza.startsWith("I like");
        c = fraza.endsWith("!!!");
        if ((a && b && c) == true) {
            System.out.println(fraza.toUpperCase());
        }
        fraza = fraza.replace("a", "o");
        System.out.println(fraza.substring(7, 11));
    }
}
