package com.Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The max value in the array is:-");
        System.out.println(Maxvalue(arr));
        System.out.println("The min value in the array is:-");
        System.out.println(Minvalue(arr));
    }
    static int Maxvalue(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int Minvalue(int[] arr)
    {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
