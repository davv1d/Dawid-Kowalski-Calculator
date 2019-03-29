package com.calculator;

public class Calculator {

    public int addAToB(int a, int b){
        return a + b;
    }
    public int subtractBFromA(int a, int b){
        return a - b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("A add B is " + calculator.addAToB(5,2));
        System.out.println("A substract B is " + calculator.subtractBFromA(10, 7));
    }
}
