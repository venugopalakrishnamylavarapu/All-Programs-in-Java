import java.util.Scanner;

import static java.lang.System.in;
//in this we find the next greatest element of the entered number(target) in the array

public class FloorOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
        System.out.println("the floor of the array number " + target + " is : " + binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            }
        }
        return arr[high];
    }
}
