package com.Exercises;

public class PowerofX {
    public static int calcPower(int x , int n) {
        if(n==0){//BASE CASE 1
             return 1;}
        if(x==0){//BASE CASE 2
             return 0;}

//STACK HEIGHT = Logn

        if(n%2 == 0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else{
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }

/*
STACK HEIGHT = n
        // We know x^n = (x^n-1)*x
        // so this is the way we use recursion here
        int xPow_n_m1 = calcPower(x,n-1);
        int xPown= x*xPow_n_m1;
        return xPown;
        ///Main function
        int x = 2,n=5;
        int ans = calcPower(x,n);
        System.out.println(ans);
        //Expected op = 32
*/

    }
    public static void main(String[] args) {

    }
}
