package com.cydeo.Task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(

                new Employee(100,"Vlad","Vlad@Cydeo.com", Arrays.asList("5714406595","57151237347")),
                new Employee(100,"John","John@Cydeo.com", Arrays.asList("57144123595","5717237476")),
                new Employee(100,"Mike","Mike@Cydeo.com", Arrays.asList("57144065123","57151124409"))



        );


    }


}
