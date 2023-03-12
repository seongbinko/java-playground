package baseball;

import java.util.*;

public class NumbersGenerator {
    private static final int MAX_NO = 9;
    private static final int MIN_NO = 1;
    private static final int MAX_NUMBERS_SIZE = 3;

    public static List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < MAX_NUMBERS_SIZE) {
            addNumber(numbers, createRandomNumber());
        }
        return numbers;
    }

    private static void addNumber(List<Integer> numbers, int randomNumber) {
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber);
        }
    }


    private static int createRandomNumber() {
        int randomNo = -1;
        while (randomNo < MIN_NO || randomNo > MAX_NO) {
            randomNo = new Random().nextInt(MAX_NO + 1);
        }
        return randomNo;
    }
}
