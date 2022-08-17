package com.volumesof3dshapes;

import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r=sc.nextDouble();
        areaOfSphere(r);
    }

    static void areaOfSphere(double radius) {
        double cube=radius*radius*radius;
        double volume= (4*3.142*cube)/3;
        System.out.println("The area of the sphere is :"+volume);
    }
}
