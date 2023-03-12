package baseball.view;

import baseball.Balls;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String input() {
        return scanner.nextLine();
    }
}