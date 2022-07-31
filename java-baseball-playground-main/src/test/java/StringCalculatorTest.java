import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();
    String expression = "2 + 3 * 4 / 2";

    @Test
    void calculateString() {
        int answer = stringCalculator.calculateString(expression);
        assertThat(answer).isEqualTo(10);
    }

    @Test
    void separate() {
        assertThat(stringCalculator.separate(expression).length).isEqualTo(7);
    }

    @Test
    void toInt() {
        assertThat(stringCalculator.toInt("1")).isEqualTo(1);
    }

    @Test
    void plus() {
        assertThat(stringCalculator.plus(1, 2)).isEqualTo(3);
    }

    @Test
    void minus() {
        assertThat(stringCalculator.minus(2, 1)).isEqualTo(1);
    }

    @Test
    void multiply() {
        assertThat(stringCalculator.multiply(2, 5)).isEqualTo(10);
    }

    @Test
    void divide() {
        assertThat(stringCalculator.divide(5, 2)).isEqualTo(2);
    }
}