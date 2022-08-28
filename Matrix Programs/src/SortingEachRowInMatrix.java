import java.util.Arrays;

public class SortingEachRowInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 8, 4},
                {1, 5, 3},
                {7, 3, 6}
        };

        //bubble sort in the 3rd nested forloop  and the sort is in descending order(if u want ascending just chane < to >)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                for (int k = 0; k < arr.length-col-1; k++) {
                    if(arr[row][k]>arr[row][k+1])
                    {
                        int temp=arr[row][k];
                        arr[row][k]=arr[row][k+1];
                        arr[row][k+1]=temp;
                    }
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
