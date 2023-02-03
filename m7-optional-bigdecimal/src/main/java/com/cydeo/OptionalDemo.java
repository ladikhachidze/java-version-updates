package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        Optional<String> emprty = Optional.empty();
        System.out.println(emprty);
        System.out.println(emprty.isPresent());

        System.out.println(Optional.of(number).isPresent());



        //isPresent
        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
        //System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(5));



    }
}
