package com.cydeo.Task;

public class AliTask2 {
    public static void main(String[] args) {


        vowel("google");

    }

    public static int vowel(String str){


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == 'a' || c=='e'||c=='i'||c=='o'||c=='u'){
                int vowelCount = 0;
                for (int j = 0; j < str.length(); j++) {

                    if(c == str.charAt(j)){
                        vowelCount++;
                    }

                }
                if(vowelCount == 1 ){
                    System.out.println(i);
                }

            }
        }

        return -1;
    }


}
