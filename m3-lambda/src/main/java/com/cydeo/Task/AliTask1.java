package com.cydeo.Task;

public class AliTask1 {
    public static void main(String[] args) {


        System.out.println(animalFeast("great blue heron", "garlic naan"));


    }


    public static boolean animalFeast(String name, String dish){
        if(dish.startsWith(name.substring(0,1)) && dish.endsWith(""+name.charAt(name.length()-1)) ){
            return true;
        }

        return false;
    }


}
