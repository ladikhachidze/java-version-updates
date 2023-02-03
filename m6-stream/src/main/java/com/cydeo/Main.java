package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



        // Creating stream from array

        String[] courses = {"Java","Spring","Agile"};

        Stream<String> sourseStream = Arrays.stream(courses);


        // Creating Stream from collection

        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream1 = courseList.stream();


        List<Course> myCourse = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)
        );


        Stream<Course> myCourseStream = myCourse.stream();


        //Creating Stream Values

        Stream<Integer> steam = Stream.of(1,2,3,4,5);


    }
}