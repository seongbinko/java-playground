package baseball;

import java.util.Objects;

public class Ball {

    private static final int MIN_POSITION = 0;
    private static final int MAX_POSITION = 2;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private final int position;

    private final int number;

    public Ball(int position, int number) {
        validateBall(position, number);
        this.position = position;
        this.number = number;
    }

    private void validateBall(int position, int number) {
        checkPosition(position);
        checkNumber(number);
    }

    private void checkNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("숫자 범위 초과");
        }
    }

    private void checkPosition(int position) {
        if (position < MIN_POSITION || position > MAX_POSITION) {
            throw new IllegalArgumentException("위치 범위 초과");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }

    public int getNumber() {
        return number;
    }

    public boolean isSameNumber(Ball ball) {
        return this.number == ball.number;
    }
}
