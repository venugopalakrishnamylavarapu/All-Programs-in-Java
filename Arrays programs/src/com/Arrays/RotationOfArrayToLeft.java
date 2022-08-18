package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class RotationOfArrayToLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is: "+ Arrays.toString(arr));
        System.out.println("Enter the rotation number:");
        int rotation=sc.nextInt();
        rotateToLeft(arr,rotation);
    }

    static void rotateToLeft(int[] arr, int rotation) {
        for (int i = 0; i < rotation; i++) {
            int first=arr[0];
            for (int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
