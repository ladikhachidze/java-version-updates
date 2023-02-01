package com.example.m4double_colon_operators;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Calculate sum = (x,y) -> System.out.println(x+y);


        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        s1.calculate(20,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(24,24);

        // Reference to a instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        s3.calculate(3,3);

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;
        System.out.println(b1.apply(new MyClass(), 20));

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

        display.accept(20);
        display2.accept(30);


    }

}
