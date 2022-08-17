package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import static java.lang.System.in;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length:");
        double l=sc.nextDouble();
        System.out.println("Enter the width :");
        double w=sc.nextDouble();
        areaOfRectangle(l,w);
        perimeterOfRectangle(l,w);
    }

     static void areaOfRectangle(double l, double w) {
        double area=l*w;
         System.out.println("The area of the rectangle is :"+area);
    }
    static void perimeterOfRectangle(double l,double w)
    {
        double perimeter =2*(l+w);
        System.out.println("The perimeter of the rectangle  is:"+perimeter);
    }
}
