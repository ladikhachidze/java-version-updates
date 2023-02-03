package com.cydeo.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FoxTest {
    public static void main(String[] args) {

        Fox fox1 = new Fox("fox1",true,true,"BLACK",0);
        Fox fox2 = new Fox("fox2",true,true,"BLACK",2);
        Fox fox3 = new Fox("fox3",true,true,"BLACK",3);
        Fox fox4 = new Fox("fox4",false,true,"GRAY",3);


        List<Fox> foxes = Arrays.asList(fox1,fox2,fox3,fox4);



      Stream<Fox> criminalFox = foxes.stream().filter(Fox::isWearsCoat)
                .filter(Fox::isHasATorch)
                .filter(fox -> fox.getCoatColor().equals("BLACK"))
                .filter(fox -> fox.bagCount == 3);



      List<Fox> goodFox = foxes.stream()
              .filter(fox -> !fox.isWearsCoat() || !fox.isHasATorch() || !fox.getCoatColor().equals("BLACK") || !(fox.bagCount == 3))
              .collect(Collectors.toList());

        System.out.println(goodFox);












    }
}
