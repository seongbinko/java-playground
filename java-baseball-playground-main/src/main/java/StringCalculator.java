public class StringCalculator {

    public int calculateString(String expression) {
        String[] values = separate(expression);
        int answer = 0;
        // 2 + 3 - 8 * 7
        for (int i = 0; i < values.length; i++) {
            try {
                toInt(values[i]);
                if (answer == 0) {
                    answer = toInt(values[i]);
                }
            } catch (Exception e) {
                if (values[i].equals("+")) {
                    answer += toInt(values[i + 1]);
                }
                if (values[i].equals("-")) {
                    answer -= toInt(values[i + 1]);
                }
                if (values[i].equals("*")) {
                    answer *= toInt(values[i + 1]);
                }
                if (values[i].equals("/")) {
                    answer /= toInt(values[i + 1]);
                }
            }
        }

        return answer;
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
