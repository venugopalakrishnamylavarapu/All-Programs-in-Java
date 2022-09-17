package com.Recursion;

import java.util.Arrays;

public class PracClass {
    public static void main(String[] args) {
        int[] arr={4,5,8,1,2,3,6,6,9,7,4,1,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int max=maxValue(arr,0,arr.length-i-1);
            swap(arr,i,max);
        }
    }
    static void swap(int [] arr,int start,int max)
    {
        int temp=arr[start];
        arr[start]=arr[max];
        arr[max]=temp;

    }
    static int maxValue(int[] arr,int start,int end)
    {
        int max=0;
        for (int i = start; i < end; i++) {
           if(arr[i]>arr[max])
           {
              max=i;
           }
        }
        return max;
    }
}
