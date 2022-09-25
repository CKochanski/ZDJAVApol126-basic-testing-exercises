package pl.sda;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

}
