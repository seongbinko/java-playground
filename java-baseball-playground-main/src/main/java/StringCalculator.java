public class StringCalculator {
    

    public int calculateString(String str) {
        String[] expression = separate(str);
        int result = toInt(expression[0]);
        for (int i = 0; i < expression.length - 2; i = i + 2) {
            result = calculate(result, expression[i + 1], expression[i + 2]);
        }
        return result;
    }

    private int calculate(int result, String operation, String secondValue) {

        if (Operation.PLUS.getValue().equals(operation)) {
            return plus(result, toInt(secondValue));
        }

        if (Operation.MINUS.getValue().equals(operation)) {
            return minus(result, toInt(secondValue));
        }

        if (Operation.MULTIPLY.getValue().equals(operation)) {
            return multiply(result, toInt(secondValue));
        }

        if (Operation.DIVIDE.getValue().equals(operation)) {
            return divide(result, toInt(secondValue));
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
