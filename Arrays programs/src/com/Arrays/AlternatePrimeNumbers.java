package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class AlternatePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if(isPrime(i)==1)
            {
                arr.add(i);
            }
        }
        System.out.println("The array of all the primes:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("The array of alternating prime numbers:-");
        for (int i = 0; i < arr.size(); i+=2) {
            System.out.print(arr.get(i)+" ");
        }
    }
    static int isPrime(int n)
    {
        int m=n/2,flag=0;
        for (int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0) {
            return 1;
        }
        else
            return 0;
    }
}
