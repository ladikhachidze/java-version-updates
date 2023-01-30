package com.cydeo.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Khachidze",36));
        users.add(new User("Jimmy", "Karakas",25));
        users.add(new User("John", "Chorder",54));
        users.add(new User("Vlad", "Basiak",32));

        printName(users,user -> user.getLastName().startsWith("E"));

    }

    private static void  printName(List<User> users, Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
