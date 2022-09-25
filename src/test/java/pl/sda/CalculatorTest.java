package pl.sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        //given
        int a = 10;
        int b = 15;

        //when
        int result = calculator.add(a, b);

        //then
        assertThat(result)
                .isEqualTo(25);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        int a = 15;
        int b = 10;

        //when
        int result = calculator.subtract(a, b);

        //then
        assertThat(result)
                .isEqualTo(5);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        int a = 2;
        int b = 4;

        //when
        int result = calculator.multiplication(a, b);

        //then
        assertThat(result)
                .isEqualTo(8);
    }

    @Test
    void shouldDivideTwoNumbers() {
        //given
        double a = 9;
        double b = 2;

        //when
        double result = calculator.division(a, b);

        //then
        assertThat(result)
                .isEqualTo(4.5);
    }

    @Test
    void shouldReturnMinusOneWhenDivideByZero() {
        //given
        double a = 9;
        double b = 0;

        //when
        double result = calculator.division(a, b);

        //then
        assertThat(result)
                .isEqualTo(-1);
    }

}
