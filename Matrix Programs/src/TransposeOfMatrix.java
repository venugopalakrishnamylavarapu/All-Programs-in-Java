import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int m=3;
        int n=3;
        int[][] arr1 = new int[m][n];       //created a new array to store the values of the transpose because sometime the the size of matrix can be different
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr1[row][col] = arr[col][row];     //in transpose row become column and column become rows
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr1[a]));
        }
    }
}
