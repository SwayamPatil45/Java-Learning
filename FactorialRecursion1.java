package com.Exercises;

public class FactorialRecursion1 {



    public static int calcFactorial(int n){
//    Base Case n == 1 or 0 then factorial value is 0
        if(n == 1||n==0){
            return 1;
        }

       int fact_nm1 = calcFactorial(n-1);
       int fact_n = n*fact_nm1;
       return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
