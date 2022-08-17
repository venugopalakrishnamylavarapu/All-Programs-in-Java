import java.util.Scanner;

import static java.lang.System.in;

public class AverageOfNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);

        System.out.println("Enter the limit of the nth number:-");
        int n=sc.nextInt();
        averageOfNumber(n);

    }
    static void averageOfNumber(int n)
    {
        int count=0,sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
            count++;
        }
        int Average=sum%count;
        System.out.println("The average of "+n+" numbers is:- "+Average);
    }
}
