import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingOfColumns {
    public static void main(String[] args) {
        int[][] arr={
                {1,6,9},
                {2,2,7},
                {5,8,3}
        };
        int col1=0;
        int col2=arr[0].length-1;

        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i][col1];
            arr[i][col1]=arr[i][col2];
            arr[i][col2]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
//        System.out.println(Arrays.deepToString(arr));
    }
}
