package baseball;


import java.util.HashSet;
import java.util.Set;

public class BaseballNumber {

    private final char[] values;

    private BaseballNumber(char[] values) {
        this.values = values;
    }

    public static BaseballNumber generate(char[] values) {
        return new BaseballNumber(values);
    }

    public static BaseballNumber generateRandomNumber() {
        int length = 3;
        Set<String> set = new HashSet<>();
        while (true) {
            if (set.size() == length) {
                break;
            }
            int i = (int) (Math.random() * 10);
            if (i == 0) {
                continue;
            }
            set.add(String.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        set.forEach(sb::append);
        return new BaseballNumber(sb.toString().toCharArray());
    }

    public int getSize() {
        return this.values.length;
    }

    public int get(int i) {
        return values[i];
    }

}
