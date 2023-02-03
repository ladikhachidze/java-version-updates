package com.cydeo.practiceMethods;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class collect_method {
    public static void main(String[] args) {




        List<String> words = new ArrayList<>();

        words.addAll(Arrays.asList(
                "filter()", "map()","limit()", "skip()", "sorted()", "distinct()",
                "forEach()", "toArray()", "reduce()","collect()","count()","min()","max()","collect()"));

       List<String> newWords = words.stream().filter(a->a.startsWith("f")).collect(Collectors.toList());

        System.out.println(newWords);

    }
}
