package com.Exercises;
import java.util.*;
public class Rectangle {

    double length;
    double width;
    String colour;

    double get_length() {
        return length;
    }
    double get_width() {
        return width;
    }
    double area() {
        return length * width;
    }
    String get_color() {
        return colour;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter length for r1:");
        r1.length = sc.nextDouble();
        System.out.println("Enter width for r1:");
        r1.width = sc.nextDouble();
        System.out.println("Enter color for r1:");
        r1.colour = sc.next();

        System.out.println("Enter length for r2:");
        r2.length = sc.nextDouble();
        System.out.println("Enter width for r2:");
        r2.width = sc.nextDouble();
        System.out.println("Enter color for r2:");
        r2.colour = sc.next();


        if(r1.area()==r2.area() && r1.get_color().equals(r2.get_color())) {
            System.out.println("Matching Rectangles");
        }
        else {
            System.out.println("Non Matching Rectangles");
        }
    }
}