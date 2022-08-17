import java.util.*;

import static java.lang.System.in;

public class keithNumber {
    static boolean isKeith(int x) {
//List stores all the digits of the X
        ArrayList<Integer> terms = new ArrayList<>();
//n denotes the number of digits
        int temp = x, n = 0;
//executes until the condition becomes false
        while (temp > 0) {
//determines the last digit of the number and add it to the List
            terms.add(temp % 10);
//removes the last digit
            temp = temp / 10;
//increments the number of digits (n) by 1
            n++;
        }
//reverse the List
        Collections.reverse(terms);
        int next_term = 0, i = n;
//finds next term for the series
//loop executes until the condition returns true
        while (next_term < x) {
            next_term = 0;
//next term is the sum of previous n terms (it depends on number of digits the number has)
            for (int j = 1; j <= n; j++)
                next_term = next_term + terms.get(i - j);
            terms.add(next_term);
            i++;
        }
//when the control comes out of the while loop, there will be two conditions:
//either next_term will be equal to x or greater than x
//if equal, the given number is Keith, else not
        return (next_term == x);
    }

    //driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked");
            int a = sc.nextInt();
//calling the user-defined method inside the if statement and print the result accordingly
            if (isKeith(a))
                System.out.println("Yes, the given number is a Keith number.");
            else
                System.out.println("No, the given number is not a Keith number.");
            System.out.println("\n");
        }

    }
}
