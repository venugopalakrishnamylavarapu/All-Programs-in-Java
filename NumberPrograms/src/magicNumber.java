import java.util.Scanner;

import static java.lang.System.in;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();
        if (n < 9) {
            System.out.println("INVALID INPUT");
            System.out.println("Please enter a valid number");
            System.exit(0);
        } else {
            while (n > 9) {
                int sum = 0;
                while (n > 0) {
                    int last = n % 10;
                    sum += last;
                    n = n / 10;
                }
                n = sum;
            }
            if (n == 1) {
                System.out.println("The number is magic number");
            } else
                System.out.println("Not a magic number");
        }
    }
}
