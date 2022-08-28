import java.util.Arrays;

public class CircularShiftingRightTheArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int row =0; row < arr.length ; row++) {
            for (int col = 0; col <arr[0].length-1; col++) {
                int temp=arr[row][col];
                arr[row][col]=arr[row][col+1];
                arr[row][col+1]=temp;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
