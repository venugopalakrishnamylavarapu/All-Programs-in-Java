import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class PracClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int [] arr={8,2,5,1,72,5,8,7,3,6,9,10,4,5,2,1,9,3,4,6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void insertionSort(int[] arr) {
         for (int i = 0; i <arr.length ; i++) {
             for (int j = 1; j < arr.length-i; j++) {
                 if(arr[j]<arr[j-1])
                 {
                     swap(arr,j,j-1);
                 }
             }
         }
     }
//     static int maxIndex(int[] arr,int start,int end)
//     {      int max=0;
//         for (int i = start; i <=end; i++) {
//             if(arr[i]>arr[max])
//             {
//                max=i;
//             }
//         }
//         return max;
//     }
  static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
