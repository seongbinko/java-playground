package baseball;

import java.util.*;

public class PlayResult {

    private final Map<BaseBallStatus, Integer> playResult;

    public PlayResult(Map<BaseBallStatus, Integer> playResult) {
        this.playResult = playResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayResult that = (PlayResult) o;
        return Objects.equals(playResult, that.playResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playResult);
    }


    @Override
    public String toString() {
        int ball = this.playResult.get(BaseBallStatus.BALL);
        int strike = this.playResult.get(BaseBallStatus.STRIKE);
        if (isRight(ball, strike)) {
            return strike + BaseBallStatus.STRIKE.name() + " " + ball + BaseBallStatus.BALL.name();
        }
        return BaseBallStatus.NOTHING.name();
    }

    private boolean isRight(int ball, int strike) {
        return ball + strike != 0;
    }
}
