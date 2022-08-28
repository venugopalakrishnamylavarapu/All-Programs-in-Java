import java.util.Arrays;

public class MIrrorImageArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5,1},
                {4,5,6,7,5,3},
                {7,8,9,3,8,9}
        };
        for (int row =0; row < arr.length ; row++) {
            for (int j = 0; j < arr[row].length/2; j++) {
                int temp = arr[row][j];
                arr[row][j] = arr[row][arr[row].length-1-j];
                arr[row][arr[row].length-1-j] = temp;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
