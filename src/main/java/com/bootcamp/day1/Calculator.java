package com.bootcamp.day1;

public class Calculator {
    public int add(int a, int b) {return a + b;}
    public int subtract(int a, int b) {return a - b;}
    public int multiply(int a, int b) {return a * b;}
    public double divide(int a, int b) {
        if ( b==0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;}

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,2));
        System.out.println(cal.divide(10,2));
    }

}
