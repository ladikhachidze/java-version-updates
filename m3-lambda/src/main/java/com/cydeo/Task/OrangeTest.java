package com.cydeo.Task;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


    public static void main(String[] args) {


        List<Orange> orangeList = new ArrayList<Orange>();
        orangeList.add(new Orange(200, Color.GREEN));
        orangeList.add(new Orange(125,Color.RED));
        orangeList.add(new Orange(333,Color.GREEN));
        orangeList.add(new Orange(444,Color.RED));


        OrangeFormatter orangeFormatter = orange -> "An orange of "+ orange.getWeight() +"g";

        prittyPrintOrange(orangeList, orangeFormatter);


        System.out.println("-----------------------------------------------------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " +ch+" "+orange.getColor()+" orange";

        };

        prittyPrintOrange(orangeList,fancyFormatter);


    }


    private static void prittyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){

        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }
}
