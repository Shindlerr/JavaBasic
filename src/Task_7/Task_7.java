package Task_7;

        import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 2;
        int z = 7;
        int d = sc.nextInt();
        int[] newArray = new int[d];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == x | newArray[i] == y | newArray[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }

        }


    }
}
