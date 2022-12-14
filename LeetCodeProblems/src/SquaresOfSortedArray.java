//977.problem link https://leetcode.com/problems/squares-of-a-sorted-array/?envType=study-plan&id=algorithm-i
import java.util.*;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
    int nums[] = {-16,-12,-6,-2,-1,0,3,5,7,10,32,56};
    int k[]=new SquaresOfSortedArray().sortedSquares(nums);
        System.out.println(Arrays.toString(k));
    }
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
    /*//the below method is another method done by me
      public int[] sortedSquares(int[] arr) {
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=arr[i]*arr[i];
            }
            Arrays.sort(arr);
            return arr;
        }

     */
}
