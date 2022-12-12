//35.problem link https://leetcode.com/problems/search-insert-position/description/?envType=study-plan&id=algorithm-i
public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        //the below are the test cases
        int target=5;
        //int target=2;
        //int target=7;
        System.out.println(new SearchInsertPosition().searchInsert(arr,target));
    }
    private int searchInsert(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }
}
