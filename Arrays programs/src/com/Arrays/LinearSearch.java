package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of elements in the array:");
        int m=sc.nextInt();
        int[] arr=new int[m];
        System.out.println("Enter the elements of the number:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The formed array is "+ Arrays.toString(arr));
        System.out.println("Enter the target you want to find:");
        int target=sc.nextInt();
        System.out.println("The target value is at the index: "+linearSearch(arr,target));
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
