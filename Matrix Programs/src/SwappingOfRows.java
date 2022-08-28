import java.util.Arrays;

public class SwappingOfRows {
    public static void main(String[] args) {
        int[][] arr={
                {1,6,9},
                {2,2,7},
                {5,8,3}
        };          //take the user input using scanner
        int row1=0;
        int row2=arr[0].length-1;
        for (int i = 0; i < arr[0].length; i++) {
            int temp=arr[row1][i];
          arr[row1][i]= arr[row2][i];
            arr[row2][i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
