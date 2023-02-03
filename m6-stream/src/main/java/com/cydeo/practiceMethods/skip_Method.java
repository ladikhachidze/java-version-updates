package com.cydeo.practiceMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skip_Method {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90));
        System.out.println(nums);

        nums = nums.stream().skip(5).collect(Collectors.toList());
        System.out.println(nums);


    }
}
