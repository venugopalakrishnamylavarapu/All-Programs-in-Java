import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class PracClass {
    public int averageValue(int[] arr) {
        int sum=0,count=0;
        for(int i=0;i<arr.length;i+=2)
        {
            if(arr[i]%3==0)
            {
                sum+=arr[i];
                count++;
            }
        }
        int j=sum/count;
        return j;
    }

    public static void main(String[] args) {
        int[] nums={1,3,6,10,12,15};
        System.out.println(new PracClass().averageValue(nums));
    }
}

