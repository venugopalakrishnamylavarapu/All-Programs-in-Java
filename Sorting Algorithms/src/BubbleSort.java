import java.util.Arrays;

public class BubbleSort {
    //best case-o(n)
    //worst case -o(n^2)
    //also called as sinking sort or exchanging sort
    //these are inplace algorithms(we might not create a new array)
    //this is an unstable algorithm(EXPLAINATION:- youtube kunal's dsa bubble sort lecture timestamp:-35:00)
    public static void main(String[] args) {
        int[] l={6,7,8,9,2};        //u can take user example
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(l);
        System.out.println(Arrays.toString(l));
    }
    public void bubbleSort(int[] arr)
    {
        //run the steps n-i times;
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length-i; j++) {        //we can also do j<j+1 but we did j>j-1 because it can solve out of bounds efficiently
                if(arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                swapped=true;
            }
            if(swapped==false)          //for the n time complexity
            {
                break;
            }
        }

    }
}
