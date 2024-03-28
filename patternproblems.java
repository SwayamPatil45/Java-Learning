package com.Exercises;

import java.util.*;
public class patternproblems {
    public static void main(String[] args) {
        //Q1 print a star pattern of solid rectangle has 4 rows 5 columns

        Scanner sc= new Scanner(System.in);
        System.out.print("No. of Columns: ");
        int n = sc.nextInt();

        for (int i = 1; i<n ; i++){
            for(int j = 1; j<n+1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }



    //    Q2. Hollow Rectangle




    }
}
