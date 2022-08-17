package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int m= sc.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Entered array is:"+ Arrays.toString(arr));
        int length= removingDuplicates(arr,arr.length);

        for (int i = 0; i <length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int removingDuplicates(int[] arr,int length) {
        int[] temp=new int[length];
        int j=0;
        for (int i = 0; i < length-1; i++) {
            if(arr[i]!=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j++]=arr[length-1];
//        if (j >= 0) System.arraycopy(temp, 0, arr, 0, j);
        for (int i = 0; i <=j; i++) {          //the above system.arraycopy is short cut of this long for loop form to copy array.
            arr[i]=temp[i];
        }
        return j;
    }
}
