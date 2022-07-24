package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void split2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        // when
        String s = "(1,2)";
        String actual = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
        assertThat(actual).isEqualTo("1,2");
    }

    /**
     * 자주 발생하는 Exception의 경우 Exception별 메서드 제공하고 있음
     * assertThatIllegalArgumentException()
     * assertThatIllegalStateException()
     * assertThatIOException()
     * assertThatNullPointerException()
     */
    @Test
    @DisplayName("특정 위치의 문자 가져오기")
    void charAt() {
        String s = "abc";
        assertThatThrownBy(() -> s.charAt(s.length()))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: " + s.length());
    }
}
