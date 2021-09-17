package com.therealtikoms;

public class Calculator {

    int num1;
    int num2;

    public Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

    public int modulo() {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(200, 50);

        System.out.println(myCalculator.add());
        System.out.println(myCalculator.subtract());
        System.out.println(myCalculator.multiply());
        System.out.println(myCalculator.divide());
        System.out.println(myCalculator.modulo());

    }
}
