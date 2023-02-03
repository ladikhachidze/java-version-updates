package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    //ALL MATCH


    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getall().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if(DishData.getall().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2= DishData.getall().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);


        System.out.println("FIND ANY");
       Optional<Dish> dish = DishData.getall().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        System.out.println("FIND FIRST");
        Optional<Dish> dish1 = DishData.getall().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish1);


        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        //MIN ADN MAX
        System.out.println("MIN");

       Optional<Dish> dMin= DishData.getall().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin);

        System.out.println("MAX");
        Optional<Dish>  dMax = DishData.getall().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);





    }


}
