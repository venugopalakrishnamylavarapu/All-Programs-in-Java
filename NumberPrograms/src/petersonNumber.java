import java.util.Scanner;

import static java.lang.System.in;

public class petersonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number to check:");
        int n=sc.nextInt(),sum=0;
        int temp=n;
        while(n>0)
        {
            int last=n%10;
            int fact=1;
            for (int i = 1; i <=last; i++) {
                fact = fact * i;
            }
            sum+=fact;
            n=n/10;
        }
        if (temp==sum) {
            System.out.println("The given number is peterson number");
        }
        else {
            System.out.println("Not a peterson number");
        }
    }
}
