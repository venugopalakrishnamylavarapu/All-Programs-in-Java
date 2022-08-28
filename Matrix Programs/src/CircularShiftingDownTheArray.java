import java.util.Arrays;

public class CircularShiftingDownTheArray {
    //same code as array up but we change the columns
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int row =arr.length-1; row > 0 ; row--) {
            for (int col = 0; col < arr[0].length; col++) {
                int temp=arr[row][col];
                arr[row][col]=arr[row-1][col];
                arr[row-1][col]=temp;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
