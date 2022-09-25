package pl.sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        //given
        int a = 10;
        int b = 15;
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(a, b);

        //then
        assertThat(result).isEqualTo(25);
    }

}
