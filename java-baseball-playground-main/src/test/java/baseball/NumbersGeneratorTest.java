package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class NumbersGeneratorTest {

    @Test
    void individual_3_numbers() {
        List<Integer> numbers = NumbersGenerator.generate();

        Assertions.assertEquals(3, numbers.size());
        Assertions.assertNotEquals(numbers.get(0) , numbers.get(1));
        Assertions.assertNotEquals(numbers.get(1) , numbers.get(2));
        Assertions.assertNotEquals(numbers.get(2) , numbers.get(0));
    }
}
