package com.Exercises;

public class ReverseString {
    /* Q1 Reverse String
    public static void printRev(String str,int idx){
            if(idx==0){
                System.out.print(str.charAt(idx));
                return;
            }
            System.out.print(str.charAt(idx));
            printRev(str,idx-1);

            In main:
            String str ="abcd";
            printRev(str,str.length()-1);
        }
    */
    public static int first = -1;
    public static int last = -1;

    public static void findoccurance(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.err.println(last);
            return;
        }
            char currChar = str.charAt(idx);

            if (currChar == element) {
                if (first == -1) {
                    first = idx;
                } else {
                    last = idx;
                }
                findoccurance(str, idx + 1, element);
            }

        //Q2 Find first and last occurance of a in the given string "abaacdaefaah"

    }
        public static void main (String args[]){
           String str = "abaacdaefaah";
           findoccurance(str,0,'a');


        }
}