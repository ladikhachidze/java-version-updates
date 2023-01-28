package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


    public static void main(String[] args) {


        List<Orange> orangeList = new ArrayList<Orange>();
        orangeList.add(new Orange(200,Color.GREEN));
        orangeList.add(new Orange(125,Color.RED));
        orangeList.add(new Orange(333,Color.GREEN));
        orangeList.add(new Orange(444,Color.RED));


        OrengeFormatter orengeFormatter = orange -> "An orange of "+ orange.getWeight() +"g";

        prittyPrintOrenge(orangeList,orengeFormatter);


    }


    private static void prittyPrintOrenge(List<Orange> inventory, OrengeFormatter formatter){

        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }
}
