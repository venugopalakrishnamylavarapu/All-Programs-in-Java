import java.util.Arrays;

public class SortingEachColumnInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 8, 4},
                {1, 5, 3},
                {7, 3, 6}
        };

        for (int col = 0; col < arr[0].length; col++) {
        for (int row = 0; row < arr.length; row++) {
                for (int k = 0; k < arr.length-row-1; k++) {
                    if(arr[k][col]>arr[k+1][col])
                    {
                        int temp=arr[k][col];
                        arr[k][col]=arr[k+1][col];
                        arr[k+1][col]=temp;
                    }
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
