import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        StringCalculator stringCalculator = new StringCalculator();
        int answer = stringCalculator.calculateString(expression);

        System.out.println(answer);
    }
}
