package com.volumesof3dshapes;

import java.util.Scanner;

import static java.lang.System.in;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length:");
        double l=sc.nextDouble();
        System.out.println("Enter the width :");
        double w=sc.nextDouble();
        System.out.println("Enter the height:");
        double h=sc.nextDouble();
        volumeOfPyramid(l,w,h);
    }

    static void volumeOfPyramid(double l, double w,double h) {
        double volume=(l*w*h)/3;
        System.out.println("The volume of the pyramid is :"+volume);
    }
}
