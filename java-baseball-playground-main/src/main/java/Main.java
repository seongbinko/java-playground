import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.calculateString(str));
    }
}
