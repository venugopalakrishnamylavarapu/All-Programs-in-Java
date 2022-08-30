import java.util.Scanner;

import static java.lang.System.in;
//question in my developer interview

public class PracClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of x:");
        int X=sc.nextInt();
        System.out.println("Enter the number of x:");
        int Y=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int m=sc.nextInt();
        System.out.println("Enter the numbers in the array:");
        int arr[][]=new int[m][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int diagnolSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j)
                {
                    diagnolSum+=arr[i][j];
                }
            }
        }
        System.out.println(diagnolSum);
        int k=SumOfNumber(arr[X][Y]);
        int z=diagnolSum/k;
        System.out.println(z);

    }
    public static int SumOfNumber(int n)
    {
        int sum=0;
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
