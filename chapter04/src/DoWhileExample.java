import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.println(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q"));

        System.out.println();
        System.out.println("q");
    }
}
