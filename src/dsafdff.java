import java.util.Scanner;

public class dsafdff {
    public static void main(String[] args) {
        bulbalyator();
    }

    public static void bulbalyator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знак операции(+,-,*,/)");
        String input = scanner.nextLine();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Ведите второе число");
        int b = scanner.nextInt();
        switch (input) {
            case "/" -> {
                int res = a / b;
                System.out.println("Результат деления является чило: " + res);
                break;
            }
            case "+" -> {
                int res = a + b;
                System.out.println("Результатом сложения являетсяя число: " + res);
                break;
            }
            case "-" -> {
                int res = a - b;
                System.out.println("Результат вычитания является число " + res);
                break;
            }
            case "*" -> {
                int res = a * b;
                System.out.println("Результат умножения является число " + res);
                break;
            }
            default -> System.out.println("Такой операции не существует");
        }

    }
}
