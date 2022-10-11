import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class PracClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] arr={4,8,9,10,14,16,19,47,59,86};
        PracClass obj=new PracClass();
        System.out.println(obj.binarySearch(arr,8));

    }

    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length ;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
