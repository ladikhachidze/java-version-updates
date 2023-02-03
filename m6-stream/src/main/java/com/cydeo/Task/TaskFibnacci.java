package com.cydeo.Task;

import java.util.stream.Stream;

public class TaskFibnacci {

    public static void main(String[] args) {


        Stream.iterate(new int[]{0,1},(s) -> new int[]{s[1], s[0] + s[1]} )
                .limit(20)
                .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));

//        int n = 100;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(i+i);
//        }


        int a = 0, b = 1, c;
        for (int i = 0; i < 20; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("");

            int sum=0;
            int previousNumber=0;
            int nextNumber=1;
            //1 1 2 3 5 8 13
            for (int i = previousNumber,k=nextNumber; i<20 ;i++,k++) {
                sum = previousNumber + nextNumber;//0+1=1 //1+1=2// 1+2//2+3//3+5
                previousNumber = nextNumber;//1//1//2//3//5
                nextNumber = sum;//next number=1//2//3//5//8
                System.out.print(previousNumber + " ");//1 1 2 3 5 8
            }


        }
}
