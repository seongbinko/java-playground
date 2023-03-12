package baseball;

import baseball.view.InputView;
import baseball.view.OutPutView;

public class Main {
    public static void main(String[] args) {
        BaseBallController baseBallController = new BaseBallController();
        while (baseBallController.isRunning()) {
            baseBallController.start();
        }
    }
}
