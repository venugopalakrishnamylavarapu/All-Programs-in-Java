import java.util.Scanner;

import static java.lang.System.in;

public class emirphNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            if (isPrime(n)) {
                int rev = 0;
                while (n != 0) {
                    int last = n % 10;
                    rev = rev * 10 + last;
                    n /= 10;
                }
                if (isPrime(rev)) {
                    System.out.println("Is an emirph number");
                } else {
                    System.out.println("Not an emirph number");
                }
            } else {
                System.out.println("Not an emirph number");
            }
            System.out.println("\n");
        }
    }
    static boolean isPrime(int n)
    {
        int  temp=n;
        if(n<=1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
