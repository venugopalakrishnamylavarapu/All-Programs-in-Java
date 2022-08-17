import java.util.Scanner;

import static java.lang.System.in;

public class mysteryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            int flag = 0;
            for (int i = 0; i <= n; i++) {
                if (i + rev(i) == n) {
                    System.out.println("The number is a mystery number");
                    System.out.println(i + "  " + rev(i));
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The number is not a mystery number");
            }
            System.out.println("\n");
        }

    }

   static int rev(int x) {
        int temp=x;
        int reve=0;
        while(temp>0)
        {
            int last=temp%10;
            reve=reve*10+last;
            temp/=10;
        }
        return reve;
    }
}
