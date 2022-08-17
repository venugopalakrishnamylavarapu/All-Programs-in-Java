package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class DescendingSortingOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Enter teh number of rows:-");
//        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the entered array is:-");
        System.out.println(Arrays.toString(arr));
        descending(arr);
        System.out.println("The array of sorting to descending order is:-");
        System.out.println(Arrays.toString(arr));

    }
    static void descending(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
