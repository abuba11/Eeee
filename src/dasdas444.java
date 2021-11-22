import java.util.Scanner;

public class dasdas444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println("Результат");
        System.out.println(sum(a, b));

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}



