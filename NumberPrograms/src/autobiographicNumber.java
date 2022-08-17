import java.util.Scanner;

import static java.lang.System.in;

public class autobiographicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true)
        {
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            int last = temp % 10;
            digits++;
            temp = temp / 10;
        }
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        if (sum == digits) {
            System.out.println("Is an Autobiographic number");
        } else
            System.out.println("Not an Autobiographic number");
            System.out.println("\n");
    }
}
}