package baseball;

public enum Status {

    CONTINUE(1), EXIT(2);

    private final int value;

    Status(int value) {
        this.value = value;
    }


    public static boolean isContinue(int value) {
        if (CONTINUE.value == value) {
            return true;
        }

        if (EXIT.value == value) {
            return false;
        }
        throw new IllegalArgumentException(String.format("올바르지 않은 입력값(%d)입니다", value));
    }
}

