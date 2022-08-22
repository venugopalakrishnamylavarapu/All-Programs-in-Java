package com.Arrays;

import javax.crypto.spec.PSource;
import java.util.*;

import static java.lang.System.in;


public class ArraysPrac {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(in);
//        int m = sc.nextInt();
        int[] arr = {8,1,2,2,3};
//        for (int i = 0; i < m; i++) {
//           arr[i]=sc.nextInt();
//        }
//        System.out.println("The given matric is");
//        System.out.println("Enter the target:");
//        int value = sc.nextInt();
//        System.out.println("The value of the "+value+" smallest element is: "+Arrays.toString(arrayShuffle(arr,value)));
//
//    }
//   static int[] arrayShuffle(int[] nums,int n)
//   {
//       int[] res = new int[2*n];
//       for(int i = 0; i < n; i++){
//           res[2 * i] = nums[i];
//           res[2 * i + 1] = nums[n+i];
//       }
//       return res;
//   }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        int[] count = new int[101];
        for(int i=0; i<nums.length; i++)
            bucket[nums[i]]++;

        for(int i=1; i<count.length; i++)
            count[i] = count[i-1] + bucket[i-1];

        for(int i=0; i<nums.length; i++)
            nums[i] = count[nums[i]];

        return nums;
    }
    }

