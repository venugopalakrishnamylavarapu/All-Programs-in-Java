//704.problem link https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
public class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={1,3,5,12,35,74};
        int target=5;
        System.out.println(new BinarySearch().search(arr,target));
    }
    public int search(int[] arr, int target) {
        int low=0,high=arr.length-1;
        if(arr.length==0)
            return -1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
