package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import static java.lang.System.in;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length of diagonal1:");
        double d1=sc.nextDouble();
        System.out.println("Enter the length of diagonal2 :");
        double d2=sc.nextDouble();
        areaOfRhombus(d1,d2);
        System.out.println("Enter the side of the rhombus");
        double s=sc.nextDouble();
        perimeterOfRhombus(s);
    }

    static void areaOfRhombus(double l, double w) {
        double area=0.5*l*w;
        System.out.println("The area of the rhombus is :"+area);
    }
    static void perimeterOfRhombus(double a)
    {
        double perimeter =4*a;
        System.out.println("The perimeter of the rhombus  is:"+perimeter);
    }
}
