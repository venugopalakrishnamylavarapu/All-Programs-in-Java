import javax.crypto.spec.PSource;
import java.util.Scanner;

import static java.lang.System.in;

public class xylemnPhloemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while (true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt(), extrsum = 0, meansum = 0;
            int temp=n;
            while (temp != 0) {
                if (temp == n || temp < 10)
                {
                    extrsum += temp % 10;
                }
                else
                {
                    meansum += temp % 10;
                }
                temp /= 10;
            }
            if (extrsum == meansum) {
                System.out.println("The number is xylem number");
            } else {
                System.out.println("The number is phloen number");
            }
            System.out.println("\n");
        }
    }
}

