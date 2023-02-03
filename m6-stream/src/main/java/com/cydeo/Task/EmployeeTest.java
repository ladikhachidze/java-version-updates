package com.cydeo.Task;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {


        EmployeeData.readAll()
                //.map(email->email.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all phone numbers");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);


        System.out.println("Pring all phone numbers with double colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
