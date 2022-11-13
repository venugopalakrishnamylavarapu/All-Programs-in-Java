package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class InputsInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //for 1D arrays we declare datatype[] varaiblename=new datatype[arguments]
        //the array is a fixed structure so there should be a limit for data in this n is the limit entered by user.
        System.out.println("Enter the limit of the array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();                //array input is taken and stored in ith position.
        }
        System.out.println("The numbers in the array are");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");                 //this is one way of printing arrays
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));           //this is another way of printing array using Arrays.toString() method
    }


    /*in 2Darrays there is two dimentions 1.rows 2.columns
    so we need to take two dimensions the syntax is datatype[][] variablename=new datatype[][]
    so basically 2d array is an array containing array ex.[[1,2,3,],[4,6,6,3,8,2,],[7,8,9,10]]
    in the above the whole array is one and the index of its contains arrays.
    For 2d array the row  is a must declared variable but column is not mandatory.
    matrix can be the best example of the 2d array implementations
     */
    static void twoDArrays(int[][] arr) {               //ardham avataniki ela methods tho rasa confuse avaku ra babu
        Scanner sc = new Scanner(in);
        System.out.println("Enter the number of rows:-");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:-");
        int n = sc.nextInt();                 //m is rows && n is columns
        int[][] arr1 = new int[m][n];
        System.out.println("Enter the numbers");
        for (int row = 0; row < m; row++) {                 //row loop in this 1 iteration is equal to total iteration of column loop
            for (int col = 0; col < n; col++) {             //column loop total iteration
                arr1[row][col] = sc.nextInt();              //same as 1d array same input method but there are two loops
            }
        }
        System.out.println("the 2d array in matrix form:-");

        for (int row = 0; row < m; row++) {                 //row loop in this 1 itteration is equal to total itteration of column loop
            for (int col = 0; col < n; col++) {             //column loop total itteration
                System.out.print(arr1[row][col] + " ");              //same as 1d array same output method but there are two loops
            }
            System.out.println();                       //this is one way of representing
        }
        for (int row = 0; row < m; row++) {
            System.out.println(Arrays.toString(arr1[row]));             //another way of representing 2d array as i said row plays important role
        }
    }
}
