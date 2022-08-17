package com.volumesof3dshapes;

import java.util.Scanner;

import static java.lang.System.in;

public class prism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the height of the prism:");
        double h=sc.nextDouble();
        System.out.println("Enter the length of the BASE rectangle:");
        double l=sc.nextDouble();
        System.out.println("Enter the length of the WIDTH rectangle:");
        double w=sc.nextDouble();
        volumeOfPrism(h,areaOfRectangle(l,w));
    }
    static double areaOfRectangle(double a,double b)
    {
        return a*b;
    }
    static void volumeOfPrism(double a,double b)
    {
        System.out.println("The volume of the prism is:"+ (a*b));
    }
}
