import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class LinearsSearch {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(in);
            System.out.println("Enter the number of elements in the array:-");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The array formed is :" + Arrays.toString(arr));
            System.out.println("Enter the number u want to search in the array:-");
            int m = sc.nextInt();
            System.out.println("The number is in the index:- " + linearSearch(arr, m));
            System.out.println();
        }

    }
    static int linearSearch(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
