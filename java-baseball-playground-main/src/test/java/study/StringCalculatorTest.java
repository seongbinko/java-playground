package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringCalculatorTest {

    private String[] values;

    @BeforeEach
    void setUp() {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        values = value.split(" ");
        sc.close();
    }


    @Test
    @DisplayName("문자열 계산기 테스트")
    void calculate() {

    }
}
