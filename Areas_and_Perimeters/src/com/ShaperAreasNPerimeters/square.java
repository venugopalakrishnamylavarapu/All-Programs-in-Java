package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import static java.lang.System.in;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length of the side of the square:");
        double l=sc.nextDouble();
        areaOfSquare(l);
        perimeterOfSquare(l);
    }
   static void areaOfSquare(double l) {
        double area=l*l;
       System.out.println("The area of the area is:"+area);
    }
    static void perimeterOfSquare(double l)
    {
        double perimeter =4*l;
        System.out.println("The perimeter of the square is:"+perimeter);
    }
}
