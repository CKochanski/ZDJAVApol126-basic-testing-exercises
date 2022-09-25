package pl.sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmailTest {

    @Test
    void shouldEmailIsGood() {
        //given
        String mail = "cos@cos";

        //when
        boolean result = EmailValidator.isCorrectEmailFormat(mail);


        //then
        assertThat(result)
                .isTrue();
    }

    @Test
    void shouldEmailIsNotGood() {
        //given
        String mail = "coscos";

        //when
        boolean result = EmailValidator.isCorrectEmailFormat(mail);


        //then
        assertThat(result)
                .isFalse();
    }

}