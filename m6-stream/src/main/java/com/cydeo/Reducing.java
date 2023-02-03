package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;

        }

        System.out.println(sum);
        System.out.println("================================================");


        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);
        System.out.println("================================================");

        System.out.println("Dish Calories Total");
       Optional<Integer> calTotal = DishData.getall().stream().map(Dish::getCalories).reduce(Integer::sum);
        System.out.println(calTotal);
        System.out.println("================================================");


        // MAX AND MIN
        System.out.println("MIN AND MAX BY USING REFERANCE METHOD");

        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> min = nums.stream().reduce(Integer::min);
        Optional<Integer> max =  nums.stream().reduce(Integer::max);
        Optional<Integer> sum1 = nums.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum1 = " + sum1);

        System.out.println("================================================");

        //COUNT

        long dishcount = DishData.getall().stream().count();
        System.out.println(dishcount);



    }
}
