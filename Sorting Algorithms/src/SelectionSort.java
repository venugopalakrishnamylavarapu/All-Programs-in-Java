import java.util.Arrays;

public class SelectionSort
{
    //best case-o(n^2)
    //worst casae-o(n^2)
    //unstable algo
    //works on small list
    public static void main(String[] args) {
        int[] l={6,4,3,5,2,1};        //u can take user example
       selectionSort(l);
        System.out.println(Arrays.toString(l));
    }
static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
                int maxvalue=maxIndex(arr,0,last);
                swap(arr,maxvalue,last);
            }
        }
    static int maxIndex(int[] arr,int start, int last)
    {
         int max=start;
        for (int i = start; i <=last ; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void swap(int [] arr,int a,int b)
    {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
}
