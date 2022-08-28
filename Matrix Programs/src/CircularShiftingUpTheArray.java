import java.util.Arrays;

public class CircularShiftingUpTheArray {
    //the first row becomes the last row by swapping each row with its neighbour until it reaches down(bottom)
    public static void main(String[] args) {
        int[][] arr={
                {1,6,9},
                {2,2,7},
                {5,8,3}
        };
        for (int row = 0; row < arr.length-1; row++) {
            for (int col = 0; col < arr[0].length; col++) {
               int temp=arr[row][col];
                arr[row][col]=arr[row+1][col];
                arr[row+1][col]=temp;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
