package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import static java.lang.System.in;

public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length:");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth:");
        double b=sc.nextDouble();
        areaOfTriangle(l,b);
        System.out.println("For perimeter fo triangle enter the 3 sides:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        perimeterOfSquare(x,y,z);

    }

     static void areaOfTriangle(double a, double b) {
        double area =0.5*a*b;
         System.out.println("Area of the traingle is:"+area);
    }
    static void perimeterOfSquare(double a,double b,double c)
    {
        double perimeter = a+b+c;
        System.out.println("The perimeter of the triangle is:"+perimeter);
    }
}
