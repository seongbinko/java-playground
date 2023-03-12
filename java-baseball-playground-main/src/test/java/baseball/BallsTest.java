package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BallsTest {

    Balls fixedBalls;


    @BeforeEach
    void init() {
        fixedBalls = new Balls(
                Arrays.asList(new Ball(0,1), new Ball(1,2), new Ball(2,3))
        );
    }

    @Test
    void isStrike() {
       Assertions.assertTrue(fixedBalls.isStrike(new Ball(0, 1)));
    }

    @Test
    void isNothing() {
        Assertions.assertTrue(fixedBalls.isNothing(new Ball(0, 4)));
    }

    @Test
    void isBall() {
        Assertions.assertTrue(fixedBalls.isBall(new Ball(0, 2)));
    }

    @Test
    void one_ball_result() {
        PlayResult playResult = fixedBalls.play("258"); //
        Assertions.assertEquals(new PlayResult(Map.of(
                BaseBallStatus.BALL,1,
                BaseBallStatus.STRIKE,0
        )) ,playResult);
    }

    @Test
    void one_strike_result() {
        PlayResult playResult = fixedBalls.play("145"); //
        Assertions.assertEquals(new PlayResult(Map.of(
                BaseBallStatus.BALL,0,
                BaseBallStatus.STRIKE,1
        )) ,playResult);
    }

    @Test
    void nothing_result() {
        PlayResult playResult = fixedBalls.play("456"); //
        Assertions.assertEquals(new PlayResult(Map.of(
                BaseBallStatus.BALL,0,
                BaseBallStatus.STRIKE,0
        )) ,playResult);
    }
}
