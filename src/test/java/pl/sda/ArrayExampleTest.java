package pl.sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayExampleTest {

    @Test
    void shouldRemoveDuplicates() {
        //given
        String[] string = {"test", "raz", "test", "dwa"};

        //when
        String[] withoutDuplicates = ArrayExample.removeDuplicates(string);

        //then
        assertThat(withoutDuplicates)
                .containsExactly("test", "raz", "dwa");
    }

}
