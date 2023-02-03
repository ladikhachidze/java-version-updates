package com.cydeo.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class AliTask2Vowel {

    public static void main(String[] args) {


/*
        String str= "google";

        for (char c : str.toCharArray()) {

            String temp = "";
            if(c == 'a' || c=='e'||c=='i'||c=='o'||c=='u'){
                temp+=c;
            }
            if(temp.contains(""+c))

            System.out.println(temp);
        }


 */


        System.out.println(firstNonRepeatingVowel("google"));


    }




    public static int firstNonRepeatingVowel(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count[c - 'a']++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if (count[c - 'a'] == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
