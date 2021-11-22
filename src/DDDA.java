import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class DDDA {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"Roman", "Alexey", "Aleksandr", "Zhora"};
        Scanner scanner = new Scanner(System.in);
        String poisk = scanner.nextLine();
        System.out.println(minLength(arrStr));
        System.out.println(maxLength(arrStr));
        poiskfound(arrStr, poisk);
    }

    public static String minLength(String[] arrStr) {
        String min = arrStr[0];
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() < min.length()) {
                min = arrStr[i];
            }
        }
        return min;
    }

    public static String maxLength(String[] arrStr) {
        String max = arrStr[0];
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() > max.length()) {
                max = arrStr[i];
            }
        }
        return max;
    }

    public static String poiskfound(String[] arrStr, String poisk) {
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(poisk)) {
                System.out.println(poisk);
            }
        }
       return poisk;
    }

}