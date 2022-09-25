package pl.sda;

import java.util.Objects;

public class Account {
    private String accountNumber;
    private String name;
    private String surname;
    private float balance;

    public Account(String accountNumber, String name, String surname, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Float.compare(account.balance, balance) == 0 && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(name, account.name) && Objects.equals(surname, account.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, name, surname, balance);
    }

    public void sendTransfer (Account account, float transferValue) {
        if(this.balance >= transferValue){
            this.balance -= transferValue;
            account.balance+= transferValue;
        }

    }
}
