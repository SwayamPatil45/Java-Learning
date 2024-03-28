package com.Exercises;

public class FibonacciRecursion1 {
    public static void printfibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);

        // Recursion: now a becomes b and b becomes c and the size now will reduce by 1 n-1
        printfibonacci(b,c,n-1);
    }


    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        int n = 5;
        //The sequence contains a b and then sum goes on continuously so we take the last term as n-2
        // because a and b have been considered already

        printfibonacci(a,b,n-2);

    }
}
