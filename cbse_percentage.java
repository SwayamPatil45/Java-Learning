package com.Exercises;
import java.util.Scanner;

// Write a program to calc percentage of a given student in cbse board exam.
// His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100)

public class cbse_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();

        float average = (sub1 + sub2 + sub3 + sub4 + sub5)/5;

        System.out.print("Percentage Scored: ");
        System.out.print(average);

    }
}
