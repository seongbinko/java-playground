package baseball;

public enum Status {

    CONTINUE(1), EXIT(2);

    private final int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
