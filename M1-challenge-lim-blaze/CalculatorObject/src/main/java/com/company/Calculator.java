package com.company;

public class Calculator {
    public int add(int a, int b) {
        int sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
        return a + b;
    }
    public int subtract(int a, int b) {
        int difference = a-b;
        System.out.println(a + " - " + b + " = " + difference);
        return a - b;
    }
    public int multiply(int a, int b) {
        int product = a*b;
        System.out.println(a + " * " + b + " = " + product);
        return a * b;
    }
    public int divide(int a, int b) {
        int quotient = a/b;
        System.out.println(a + " / " + b + " = " + quotient);
        return a / b;
    }

    public double add(double a, double b) {
        double sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
        return a + b;
    }
    public double subtract(double a, double b) {
        double difference = a-b;
        System.out.println(a + " - " + b + " = " + difference);
        return a - b;
    }
    public double multiply(double a, double b) {
        double product = a*b;
        System.out.println(a + " * " + b + " = " + product);
        return a * b;
    }
    public double divide(double a, double b) {
        double quotient = a/b;
        System.out.println(a + " / " + b + " = " + quotient);
        return a / b;
    }

}
