package baseball;


import java.util.HashSet;
import java.util.Set;

public class RandomBaseballNumber {

    private final Integer value;

    public RandomBaseballNumber(int value) {
        this.value = value;
    }

    public static RandomBaseballNumber generate() {
        int length = 3;
        Set<Integer> set = new HashSet<>();
        while (true) {
            if (set.size() == length) {
                break;
            }
            int i = (int) (Math.random() * 10);
            if (i == 0) {
                continue;
            }
            set.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : set) {
            sb.append(integer);
        }
        return new RandomBaseballNumber(Integer.parseInt(sb.toString()));
    }

    public Integer getValue() {
        return this.value;
    }
}
