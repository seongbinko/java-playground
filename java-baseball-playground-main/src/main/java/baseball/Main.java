package baseball;

import baseball.view.InputView;
import baseball.view.OutPutView;

public class Main {
    public static void main(String[] args) {
        PlayResult playResult = new Balls(Balls.generateComputerBalls())
                .play(InputView.input());
        OutPutView.printPlayResult(playResult);
    }
}
