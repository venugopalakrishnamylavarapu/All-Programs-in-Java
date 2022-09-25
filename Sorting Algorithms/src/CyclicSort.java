import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class CyclicSort {
    //very important algorithm asked in google,amazon,facebook etc many times
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int[] arr= {5,3,9,31,2,3,29,97,7,41,1,3,3,2,6,6,9,7,2,58,6,3,85,1};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicSort(int[] arr) {
        int i=0;                                    //if we take i=1 then correctindex=arr[i]
         while(i<arr.length) {
             int correctIndex=arr[i]-1;
             if(arr[i]<arr.length && arr[i]!=arr[correctIndex])          //as you can see we sorted the array in one pass
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
