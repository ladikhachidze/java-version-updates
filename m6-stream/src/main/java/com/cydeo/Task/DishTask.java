package com.cydeo.Task;

import lombok.Data;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {



        // Print all dish names that has less than 400 calories

        DishData.getall().stream()
                .filter(dish->dish.getCalories()<400)
               // .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        // Print the length of the name of each dish

        DishData.getall().stream()
                .map(str -> str.getName().length())
                .forEach(System.out::println);

        //Print three high caloric dish name (>300).

        DishData.getall().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted

        System.out.println("Task4");

        DishData.getall().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(dish -> dish.getCalories()))
                .map(Dish::getName)
                .forEach(System.out::println);


       Stream<Dish> dishStream = DishData.getall().stream();




    }
}
