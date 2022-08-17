package com.ShaperAreasNPerimeters;

import java.util.Scanner;

import static java.lang.System.in;

public class parallelogram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length:");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth :");
        double b=sc.nextDouble();
        areaOfParallelogram(l,b);
        System.out.println("Enter the side of the parallelgram");
        double s=sc.nextDouble();
        perimeterOfParallelogram(s,b);
    }
    static void areaOfParallelogram(double l, double w) {
        double area=l*w;
        System.out.println("The area of the parallelogram is :"+area);
    }
    static void perimeterOfParallelogram(double a,double b)
    {
        double perimeter =2*(a+b);
        System.out.println("The perimeter of the parallelogram is  is:"+perimeter);
    }
}
