package com.volumesof3dshapes;

import java.util.Scanner;

import static java.lang.System.in;

public class cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the length of the cube:");
        double l=sc.nextDouble();
        totalSurfaceAreaOfCube(l);
    }
    static void totalSurfaceAreaOfCube(double a)
    {
        System.out.println("The total surface area of the cube is:"+(6*(a*a)));
    }
}
