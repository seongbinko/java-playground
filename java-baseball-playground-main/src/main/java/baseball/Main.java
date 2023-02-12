package baseball;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] randomNumber = RandomBaseballNumber.generate()
                .getValue()
                .toString()
                .toCharArray();
        while (true) {
            System.out.print("숫자를 입력해주세요: ");

            Map<String, Integer> result = new HashMap<>();

            char[] inputNumber = scanner.nextLine()
                    .toCharArray();

            // 숫자 검증 및 출력
            for (int i = 0; i < randomNumber.length; i++) {
                for (int j = 0; j < inputNumber.length; j++) {
                    if (randomNumber[i] == inputNumber[j]) {
                        if (i == j) {
                            Integer strike = result.getOrDefault("스트라이크", 0);
                            result.put("스트라이크", strike + 1);
                            break;
                        }
                        Integer ball = result.getOrDefault("볼", 0);
                        result.put("볼", ball + 1);
                    }
                }

            }
            Integer strikeCount = result.getOrDefault("스트라이크",0);
            Integer ballCount = result.getOrDefault("볼",0);

            if (3 == strikeCount) {

                // 게임을 다시할지 안할지 여부

                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로시작하려면 1, 종료하려면 2를 입력하세요.");
                int statusValue = scanner.nextInt();

                if (Status.CONTINUE.getValue() == statusValue) {
                    randomNumber = RandomBaseballNumber.generate()
                            .getValue()
                            .toString()
                            .toCharArray();
                    continue;
                }

                if (Status.EXIT.getValue() == statusValue) {
                    break;
                }

                throw new IllegalArgumentException(String.format("올바르지 않은 값(%d)입니다", statusValue));
            }
            System.out.println(String.format("%d스트라이크 %d볼", strikeCount, ballCount));
        }

        scanner.close();

    }
}
