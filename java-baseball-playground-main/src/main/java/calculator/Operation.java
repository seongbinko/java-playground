package calculator;

public enum Operation {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String value;

    Operation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
