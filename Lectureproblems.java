package com.Exercises;
import java.util.*;
public class Lectureproblems {
    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);

        ///Q1 Prints characters of a string

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
////////////////////////

       /* Q2 print the the length of string without using length function

       int len = 0;
       char ch[] = str.toCharArray();
       for(char c:ch){
           len++;
       }
        System.out.println(len);*/
////////////////////////

        //Q3 count number of vowwels in a string

//        char ch[] = str.toCharArray();
//        int vowelCount = 0;
//
//        // Count the number of vowels without using a separate function
//        for (char c : str.toCharArray()) {
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                vowelCount++;
//            }
//        }
//        System.out.println(vowelCount);


 /////////////////
//        char ch[] = str.toCharArray();
//        int count =0;
//
//        for(int i = 0; i<str.length();i++){
//            if(str.toUpperCase(str[i])){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//}
