import java.util.Scanner;

public class asdfasdfa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во");
        int count = scanner.nextInt();
        System.out.println("Введите фразу");
        String a = scanner.next();
        System.out.println("Вывод:");
        checkwhile(count,a);
    }
    public static void checkwhile(int count, String a){
        int startcount = 1;
        while (startcount<=count){
            System.out.println(a);
            startcount++;
        }

    }
}
