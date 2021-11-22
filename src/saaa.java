import java.util.Scanner;

public class saaa {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"Roman", "Alexey", "Aleksandr", "Zhora"};
        Scanner scanner = new Scanner(System.in);
        String poisk = scanner.nextLine();
        poiskfound(arrStr, poisk);
    }
    public static void poiskfound(String[] arrStr, String poisk) {
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(poisk)) {
                System.out.println(poisk);
            }
        }
    }

}
