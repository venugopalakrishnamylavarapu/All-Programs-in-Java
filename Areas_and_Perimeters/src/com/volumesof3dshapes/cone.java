package com.volumesof3dshapes;

import java.util.Scanner;

import static java.lang.System.in;

public class cone
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the radius of the cone:");
        double r=sc.nextDouble();
        System.out.println("Enter the height of the cone:");
        double h=sc.nextDouble();
        volumeOfCone(r,h);
    }
    static void volumeOfCone(double a,double b)
    {
        double volume=3.142*(a*a)*(b/3);
        System.out.println("The volume of the cone is:"+volume);
    }
}
