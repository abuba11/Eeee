import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dast2 {
    public static void main(String[] args) {
        int[] arr = {45, 89, 3, 99, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }

        public static int min(int[] arr) {
            int tempting = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < tempting) {
                    tempting = arr[i];
                }
            }
            return tempting;
        }

        public static int max(int[] arr) {
            int tempting = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > tempting) {
                    tempting = arr[i];
                }
            }
            return tempting;
        }
    }
