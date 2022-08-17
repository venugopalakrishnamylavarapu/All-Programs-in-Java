//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;

public class ConcatinationOfArrays {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(in);
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            ConcatinationOfArrays ob = new ConcatinationOfArrays();
            int[] solution = ob.getConcatenation(arr);
            System.out.println(Arrays.toString(solution));
        }
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}

