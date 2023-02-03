package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {



        // Given a list of words, print the number of characters for each word.
        System.out.println("Task");
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);




        //Print all dich's name that has less than 400 calories.



    }
}
