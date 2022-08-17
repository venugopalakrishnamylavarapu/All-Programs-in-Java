import java.util.*;
import java.lang.*;

import static java.lang.System.in;

public class evilNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true)
        {
            System.out.println("Enter the number to be checked:");
            int n=sc.nextInt();
            int temp=n;
            int count=0;
            while(temp>0)
            {
                int rem=temp%2;
                if(rem==1)
                {
                    count++;
                }
                temp=temp/2;
            }
            if(count%2==0)
            {
                System.out.println("The number is an evil number");
            }
            else
            {
                System.out.println("Not an evil number");
            }
        }
    }
}
