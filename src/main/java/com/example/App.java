package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args){
        App calculator = new App();
        System.out.println(calculator.add(10,20));
        System.out.println(calculator.sub(20,30));
    }
}
