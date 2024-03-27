package ru.bikbaev.hw_3.calculator;

public class Calculator {
    public static <T1 extends Number, T2 extends Number> void sum(T1 num1, T2 num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        System.out.println(result);
    }

    public static <T1 extends Number, T2 extends Number> void multiply(T1 num1, T2 num2) {
        double result = num1.doubleValue()*num2.doubleValue();
        System.out.println(result);
    }

    public static  <T1 extends Number, T2 extends Number> void divide(T1 num1, T2 num2) {
        double result = num1.doubleValue()/num2.doubleValue();
        System.out.println(result);
    }

    public static  <T1 extends Number, T2 extends Number>void substract(T1 num1, T2 num2) {
        double result = num1.doubleValue()-num2.doubleValue();
        System.out.println(result);
    }


}
