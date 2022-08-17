package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import  java.lang.System;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r=sc.nextDouble();
        areaOfCircle(r);
        perimeterOfCircle(r);
    }

    static void areaOfCircle(double radius) {
        double square=radius*radius;
       double area=3.142*square;
        System.out.println("The area of the circle is :"+area);
    }
    static void perimeterOfCircle(double r)
    {
        double perimeter =2*3.142*r;
        System.out.println("The circumference of the circle is:"+perimeter);
    }
}
