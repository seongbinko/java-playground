public class StringCalculator {
    

    public int calculateString(String str) {
        String[] expression = separate(str);
        int result = toInt(expression[0]);
        for (int i = 0; i < expression.length - 2; i = i + 2) {
            result = calculate(result, expression[i + 1], toInt(expression[i + 2]));
        }
        return result;
    }

    private int calculate(int result, String operation, int value) {

        if (Operation.PLUS.getValue().equals(operation)) {
            return plus(result, value);
        }

        if (Operation.MINUS.getValue().equals(operation)) {
            return minus(result, value);
        }

        if (Operation.MULTIPLY.getValue().equals(operation)) {
            return multiply(result, value);
        }

        if (Operation.DIVIDE.getValue().equals(operation)) {
            return divide(result, value);
        }
        throw new IllegalArgumentException();
    }

    public String[] separate(String expression) {
        return expression.split(" ");
    }

    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
