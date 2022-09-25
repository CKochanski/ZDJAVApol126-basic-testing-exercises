package pl.sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void shouldSendTransfer(){

        //given
        Account account1 = new Account("12345678901234567890123456", "Przemek","Zet",1000);
        Account account2 = new Account("098746543210987654321123456","Jan","Kowalski", 1000);
        // when
        account1.sendTransfer(account2,700);

        //then
        assertThat(account1.getBalance()).isEqualTo(300);

        assertThat(account2.getBalance()).isEqualTo(1700);

    }

    @Test
    void shouldNotSendTransfer(){
        //given
        Account account1 = new Account("12345678901234567890123456", "Przemek","Zet",1000);
        Account account2 = new Account("098746543210987654321123456","Jan","Kowalski", 1000);

        //when
        account1.sendTransfer(account2,1100);

        //then
        assertThat(account1.getBalance()).isEqualTo(1000);

        assertThat(account2.getBalance()).isEqualTo(1000);
    }
}
