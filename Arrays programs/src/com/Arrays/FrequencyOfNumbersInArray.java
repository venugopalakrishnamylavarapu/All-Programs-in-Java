package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class FrequencyOfNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //Initialize array
        System.out.println("Enter the number of elements u want in array:");
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is:" + Arrays.toString(arr));
        frequency(arr);
    }
    static void frequency(int[] arr)
    {
        //Array fr will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
