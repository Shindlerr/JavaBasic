package Final_task_3;

import java.util.Scanner;

public class Final_task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maxStr = "";
        int maxCount = 0;
        int n = sc.nextInt();
        String[] array = new String[n];
        char[] newArray;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
            // System.out.println(array[i]);
        }
        for (int j = 0; j < array.length; j++) {
            int count = 1;
            boolean uniq = true;
            newArray = array[j].toCharArray();
            for (int z = 0; z < newArray.length - 1; z++) {
                for (int x = z + 1; x < newArray.length; x++) {
                    if (newArray[z] == newArray[x]) {
                        uniq = false;
                    } else if (uniq) {
                        count++;
                    }
                    if (count > maxCount) {
                        maxCount = count;
                        maxStr = array[j];
                }
            }
            // System.out.println(count);
            }
        }
        System.out.println(maxStr);
    }
}
