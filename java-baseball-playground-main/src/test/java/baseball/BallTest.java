package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BallTest {

    @ParameterizedTest
    @CsvSource(value = {"0:10", "-1:9"}, delimiter = ':')
    void create_out_of_range(int position, int number) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Ball(position, number);
        });
    }

    @Test
    void is_same_ball_number() {
        Ball ball = new Ball(0, 1);
        Assertions.assertTrue(ball.isSameNumber(new Ball(2,1)));
    }
}
