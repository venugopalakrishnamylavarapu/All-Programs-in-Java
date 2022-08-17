package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Enter the number of elements in the array:-");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("The formed array is:-"+ Arrays.toString(arr));
//        ascending(arr);
//        System.out.println("The formed array in ascending order is:-"+ Arrays.toString(arr));
//        System.out.println("Array after sorting:-"+Arrays.toString(arr));
        System.out.println("The formed array in descending order is:-"+ Arrays.toString(arr));
        descending(arr);
        System.out.println("Array after sorting:-"+Arrays.toString(arr));
        System.out.println("Enter the element you want to find in the array:-");
        int n = sc.nextInt();
        System.out.println("The value is present at index:-  "+binarySearch(arr, n));
    }

    static int binarySearch(int[] arr, int n) {
        if (arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        if (arr[0] < arr.length-1)
        {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (n == arr[mid]) {
                    return mid;
                } else if (n > arr[mid]) {
                    high = mid - 1;
                } else if (n < arr[mid]) {
                    low = mid + 1;
                }
            }
        return -1;
    }
        else if(arr[0] > arr.length-1)
        {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (n == arr[mid]) {
                    return mid;
                } else if (n < arr[mid]) {
                    high = mid - 1;
                } else if (n > arr[mid]) {
                    low = mid + 1;
                }
            }
            return -1;
        }return -1;
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
    static void ascending(int [] arr)
    {
        for (int i = 0; i < arr.length;  i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
