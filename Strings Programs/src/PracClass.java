
/*
 Task35 & Task35A are interlinked

 Take 3 variables
 empName
 empSalary
 empExperience

 provide encapsulation for this variable
 ask the user to provide the information for the 3 using getters and setters.
 if exp is 5 or more than 5 u need to increase the sal by 10% and print it

 u should not write any kind of logic in class b
 class b must be used to ask the user and print the data.
 */
public class PracClass {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        //int k=5;
        //int k=2;
        int k=7;
        System.out.println(searchInsert(arr,k));
    }
    static int searchInsert(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target) {
                return mid;
            }
            if(arr[mid]>target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
