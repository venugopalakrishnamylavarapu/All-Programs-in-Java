package com.Arrays;

import javax.crypto.spec.PSource;
import java.util.*;

import static java.lang.System.in;


public class ArraysPrac {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
           arr[i]=sc.nextInt();
        }
        System.out.println("The given matric is");
        System.out.println("Enter the target:");
        int value = sc.nextInt();
        System.out.println("The value of the "+value+" smallest element is: "+max(arr,value));

    }
    static int max(int [] arr,int value)
    {
        int ans=-1;
        Arrays.sort(arr);
       ans=arr[value];
        return ans;
    }
}
