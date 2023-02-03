package com.cydeo.practiceMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class distinct_Method {
    public static void main(String[] args) {


        // removes duplicate
        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,5,6,7,7,7,7,8,8,9,9,9,9};

        nums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(nums));




        String[] str= {"Java","Java","Java","Python","Python","Python",};
        List<String> asd =  Arrays.stream(str).distinct().collect(toList());

        System.out.println(asd);


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,5,6,7,7,7,7,8,8,9,9,9,9));

        numbers =numbers.stream().distinct().collect(toList());
        System.out.println(numbers);


    }
}
