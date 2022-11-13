package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class BinarySearchInTwoDArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
//        System.out.println("enter the number of rows:");
//        int m=sc.nextInt();
//        System.out.println("enter the number of cols:");
//        int n=sc.nextInt();
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                };
//        System.out.println("Enter the values in the matrix:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {      //we used the short cut here since the array in the array is considered as one index
//            System.out.println("The given matrix array is:"+ Arrays.toString(arr[row])); //and here we print the array with index(which consists of arrays)
//        }
         System.out.println("Enter the target:");
        int target=sc.nextInt();
        System.out.println("The index of the target value in the matrix is:");
        int[] index=binarySearchIn2dArrays(arr,target);
        System.out.println(Arrays.toString(index));
    }
    static int[] binarySearchIn2dArrays(int[][] matrix,int target)
    {
        int row=0;
        int col=matrix.length-1;
        while (row<=matrix.length&&col>=0)
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
             else if(target<matrix[row][col]) {
                col--;
            }
             else if(target>matrix[row][col])         //condition entantey target>matrix[row][col]
            {
                row++;
            }
        return new int[]{-1,-1};
    }
}
