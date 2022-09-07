import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class CyclicSort {
    //very important algorithm asked in google,amazon,facebook etc many times
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicSort(int[] arr) {
        int i=0;
         while(i<arr.length) {
             int correctIndex=arr[i]-1;
             if(arr[i]!=arr[correctIndex])          //as you can see we sorted the array in one pass
             {
                 swap(arr,i,correctIndex);
             }
             else {
                 i++;
             }
         }
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
