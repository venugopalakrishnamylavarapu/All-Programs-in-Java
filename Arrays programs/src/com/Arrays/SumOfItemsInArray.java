package com.Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class SumOfItemsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum is:-"+sum);
    }
}
