package baseball;

public class Baseball {

    private int strike;

    private int ball;

    private Baseball(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static Baseball makeBaseballByNumber(BaseballNumber randomNumber, BaseballNumber inputNumber) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < randomNumber.getSize(); i++) {
            for (int j = 0; j < inputNumber.getSize(); j++) {
                if (randomNumber.get(i) == inputNumber.get(j)) {
                    if (i == j) {
                        strike++;
                        break;
                    }
                    ball++;
                }
            }
        }
        return new Baseball(strike, ball);
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isStrikeOut() {
        return this.strike == 3;
    }

    public boolean isNothing() {
        return this.strike + this.ball == 0;
    }
}
