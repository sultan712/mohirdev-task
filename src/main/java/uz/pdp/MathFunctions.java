package uz.pdp;

public class MathFunctions {

    // ADD
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // SUB
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    // MULTIPLY
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // DIV
    public double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Bo‘lish mumkin emas");
        }
        return (double) a / b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Bo‘lish mumkin emas");
        }
        return a / b;
    }

    // ABS
    public int abs(int a) {
        return a < 0 ? -a : a;
    }

    public double abs(double a) {
        return a < 0 ? -a : a;
    }

    // POW (kvadrat)
    public int pow(int a) {
        return a * a;
    }

    public double pow(double a) {
        return a * a;
    }
}
