import java.util.Scanner;

import static java.lang.System.in;

public class buzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n=sc.nextInt();
            if(n>0) {
                int temp=n;
                while (temp > 0) {
                    int last=temp% 10;
                    if(last==7)
                    {
                        System.out.println("The number is Buzz Number");
                        break;
                    }
                    else if(n%7==0)
                    {
                        System.out.println("The number is Buzz Number");
                        break;
                    }
                    else
                        System.out.println("Not a Buzz Number");
                    break;
                }
                System.out.println("\n");
            }
        }

    }
}
