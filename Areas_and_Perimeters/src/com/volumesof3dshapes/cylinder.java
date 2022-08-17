package com.volumesof3dshapes;

import java.util.Scanner;

import static java.lang.System.in;

public class cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the radius of the cylinder:");
        double r=sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double h=sc.nextDouble();
        volumeOfCylinder(r,h);
        curvedSurfaceArea(r,h);
    }
    static void volumeOfCylinder(double a,double b)
    {
        double volume=3.142*(a*a)*b;
        System.out.println("The volume of the cylinder is:"+volume);
    }
    static void curvedSurfaceArea(double a,double b)
    {
        double CSA=2*3.142*a*b;
        System.out.println("The curved surface area of the cylinder is:"+CSA);
    }
}
