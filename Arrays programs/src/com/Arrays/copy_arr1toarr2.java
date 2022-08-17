package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class copy_arr1toarr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Enter the numbers in 1st array:");
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("1st array elements are :-");
        System.out.println(Arrays.toString(arr));
        for (int j = 0, i = 0; j < arr.length; i++, j++) {
            arr2[j] = arr[i];
        }
        System.out.println("copied elements from array 1 to array 2 are:-");
        System.out.println(Arrays.toString(arr2));
    }
}
