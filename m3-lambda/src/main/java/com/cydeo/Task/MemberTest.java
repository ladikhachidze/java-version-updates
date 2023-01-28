package com.cydeo.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {


    Person p1 = new Person("Vlad",36,Gender.MALE);
    Person p2 = new Person("Max",31,Gender.MALE);
    Person p3 = new Person("Ana",30,Gender.FEMALE);
    Person p4 = new Person("Eka",45,Gender.FEMALE);
    
    List<Person> personList = Arrays.asList(p1,p2,p3,p4);

    CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=40;



    print(personList,checkMember);

    
    



    }


    private static void print(List<Person> personList, CheckMember member){
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(member.test(person)){
                result.add(person);
            }
            
        }
        System.out.println(result);
    }



}
