//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
import java.util.*;
public class KidsWithCandies {
    public static void main(String[] args) {
        int[] arr1={2,3,5,1,3};
        int[] arr2={4,2,1,1,2};
        int[] arr3={12,1,12};
        System.out.println(kidsWithCandies(arr1,3));
        System.out.println(kidsWithCandies(arr2,1));
        System.out.println(kidsWithCandies(arr3,10));
    }
   static List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<Boolean>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);
        }
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]+extraCandies>=max);
        }
        return list;
    }
}
