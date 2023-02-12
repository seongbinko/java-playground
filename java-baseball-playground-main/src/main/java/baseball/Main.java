package baseball;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseballNumber target = BaseballNumber.generateRandomNumber();
        while (true) {

            System.out.print("숫자를 입력해주세요: ");

            BaseballNumber input = BaseballNumber.generate(
                    String.valueOf(scanner.nextInt()).toCharArray()
            );

            // 숫자 검증 및 출력
            Baseball baseball = Baseball.makeBaseballByNumber(target, input);

            if (baseball.isStrikeOut()) {
                // 게임을 계속할지 안할지
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로시작하려면 1, 종료하려면 2를 입력하세요.");
                if (Status.isContinue(scanner.nextInt())) {
                    target = BaseballNumber.generateRandomNumber();
                    continue;
                }
                break;
            }
            if (baseball.isNothing()) {
                System.out.println(BaseballEnum.낫싱);
                continue;
            }
            System.out.println(String.format("%d%s %d%s", baseball.getStrike(), BaseballEnum.스트라이크, baseball.getBall(), BaseballEnum.볼));
        }
        scanner.close();
    }
}
