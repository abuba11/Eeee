import java.util.Arrays;
import java.util.Scanner;

public class dast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        a[0]= scanner.nextInt();
        a[1]= scanner.nextInt();
        a[2]= scanner.nextInt();
        a[3]= scanner.nextInt();
        a[4]= scanner.nextInt();
        writeA(a);
    }
    public static void writeA(int[] a){
        for (int i=0; i < a.length; i++)
            System.out.print("{" + a[i] +"}"+ ",");
    }
}
