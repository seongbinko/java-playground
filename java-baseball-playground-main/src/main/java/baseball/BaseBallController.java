package baseball;

import baseball.view.InputView;
import baseball.view.OutPutView;

public class BaseBallController {
    private boolean running = true;

    private Balls balls = new Balls(Balls.generateComputerBalls());

    public void start() {
        PlayResult playResult = balls
                .play(InputView.input());
        OutPutView.printPlayResult(playResult);
        exit(playResult.isAnswer());
    }

    private void exit(boolean isAnswer) {
        if (isAnswer) {
            running = false;
        }
    }

    public boolean isRunning() {
        return running;
    }
}
