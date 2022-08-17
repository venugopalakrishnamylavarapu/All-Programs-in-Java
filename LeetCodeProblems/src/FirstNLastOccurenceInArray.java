import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class FirstNLastOccurenceInArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of elements u want in the array:");
        int m=sc.nextInt();
        int[] arr=new int[m];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        System.out.println("The indexes of the target first and last occurence is:"+ Arrays.toString(indexes(arr,target)));
    }
    static int[] indexes(int[] arr,int target)
    {   int[] ans={-1,-1};
        ans[0]=binarySearch(arr,target,true);
        ans[1]=binarySearch(arr,target,false);
        return ans;
    }
    static int binarySearch(int[] arr,int target,boolean firstoccurance)
    {int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(firstoccurance)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
}
