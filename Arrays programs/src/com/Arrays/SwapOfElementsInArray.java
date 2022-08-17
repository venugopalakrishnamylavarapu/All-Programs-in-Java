package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;

public class SwapOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is:-");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Array after swaping:-");
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
        static void swap(int[] arr,int index,int index1)
        {
            int temp=arr[index];
            arr[index]=arr[index1];
            arr[index1]=temp;
        }
        }

