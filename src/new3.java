import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        int counts = scanner.nextInt();
        System.out.println("До скольки?");
        int endNumbers = scanner.nextInt();
        int[] arrs1 = print(counts, endNumbers);
        System.out.println(Arrays.toString(arrs1));
        System.out.println(min(arrs1));
        int[] arrs2 = print(counts, endNumbers);
        System.out.println(Arrays.toString(arrs2));
        System.out.println(max(arrs2));

    }

    public static int[] print(int counts, int endNumbers) {
        Random random = new Random();
        int[] arrs = new int[counts];
        for (int i = 0; i < counts; i++) {
            arrs[i] = random.nextInt(endNumbers);
        }
        return arrs;
    }

    public static int min(int[] arrs1) {
        int temp = arrs1[0];
        for (int i = 0; i < arrs1.length; i++) {
            if (arrs1[i] < temp) {
                temp = arrs1[i];
            }
        }
        return temp;
    }

    public static int max(int[] arrs2) {
        int temp = arrs2[0];
        for (int i = 0; i < arrs2.length; i++) {
            if (arrs2[i] > temp) {
                temp = arrs2[i];
            }
        }
        return temp;
    }
}