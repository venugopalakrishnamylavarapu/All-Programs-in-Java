package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class RotationOfArrayToRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is: "+Arrays.toString(arr));
        System.out.println("Enter the rotation number:");
        int rotation=sc.nextInt();
        rotateToRight(arr,rotation);
    }
    static void rotateToRight(int[] arr,int rotate)
    {
        for (int i = 0; i < rotate; i++) {
            int last=arr[arr.length-1];
            for (int j=arr.length-1;j>0; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
