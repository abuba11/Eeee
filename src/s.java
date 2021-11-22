import java.util.Random;
import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rand = random.nextInt(100);
        int count = 1;
        while (true) {
            System.out.println("Введите число");
            int variandt = scanner.nextInt();
            if (variandt == rand) {
                System.out.println("Вы нашли число");
                System.out.println("Вы нашли число за " + count + "попыток");
                break;
            } else if (variandt > rand) {
                System.out.println("Ваше чиcло больше чем загадонное");
            } else {
                System.out.println("Ваше число меньше чем заганонное");
            }
            if (count > 8) {
                System.out.println("Вы 'умный' человек");
                System.out.println("(Нет)");
                break;
            }
            count++;

        }

    }
}
