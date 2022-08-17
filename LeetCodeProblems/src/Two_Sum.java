import java.util.Scanner;

import static java.lang.System.in;
//https://leetcode.com/problems/two-sum/
public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int [] arr={2,7,11,15};
        int target=sc.nextInt();
        sumIndexes(arr,9);

    }
    public static int[] sumIndexes(int[] arr, int target)
    {
        int[] indexes=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target)
                {
                    indexes[0]=i;
                    indexes[1]=j;
                }
            }
        }
        return indexes;
    }
}
