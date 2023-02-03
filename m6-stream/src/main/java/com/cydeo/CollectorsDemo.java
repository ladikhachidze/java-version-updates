package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;
import com.cydeo.Task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,8,6);

        System.out.println("  toCollection(Supplier) ");

       List<Integer> numList =  numbers.stream().filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));


        System.out.println(numList);

        // set does not alow the duplicates
        Set<Integer> numSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numSet);

        // toList()
        System.out.println(" toList() : returns a Collector interface that gathers the input data into a new list");

        List<Integer> intList = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(intList);

        // toSet()
        System.out.println(" toSet() : returns a Collector interface that gathers the input data into a new set");
        Set<Integer> intSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(intSet);

        //  toMap(Function,Function) : returns a Collector interface that gathers the input into a new map
        System.out.println("toMap(Function,Function) : returns a Collector interface that gathers the input into a new map");

        Map<String,Integer> dishMap = DishData.getall().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);


        //  summingInt(ToIntFunction) : returns a Collection that produces the sum of a Integer-valued function
        System.out.println("summingInt(ToIntFunction) : returns a Collection that produces the sum of a Integer-valued function");

        Integer sum = DishData.getall().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);



        // counting(): returns a Collector that counts the number of the elements
        System.out.println("counting(): returns a Collector that counts the number of the elements");


        Long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());  // it can be replaced with count()
        System.out.println(evenCount);


        // averagingInt(ToIntFunction): returns the average of the integers passed values
        System.out.println("averagingInt(ToIntFunction): returns the average of the integers passed values");

        Double calorieAverage = DishData.getall().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        //  joining(): is used to join various elements of a character or string array into a single object
        System.out.println("joining(): is used to join various elements of a character or string array into a single object");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);


        // partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
        System.out.println("partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.");

        Map<Boolean,List<Dish>> vegiDish = DishData.getall().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(vegiDish);


        // groupingBy(): is used for a grouping objects by some property and storing results in a Map instance
        System.out.println("groupingBy(): is used for a grouping objects by some property and storing results in a Map instance");
        Map<Type,List<Dish>> dishType = DishData.getall().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);

    }
}
