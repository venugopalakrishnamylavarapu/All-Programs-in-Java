import java.util.Scanner;

import static java.lang.System.in;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the n value:-");
        int a=sc.nextInt();
        System.out.println("Enter the r value:-");
        int b=sc.nextInt();

        double deno=factorial(b)*(factorial(a-b));
        double npr=factorial(a)/deno;
        System.out.println("The value of Permutations  are:-"+npr);
        System.out.println();
        double deno1=factorial(a-b);
        double ncr=factorial(a)/deno1;
        System.out.println("the value of Comibations are:-"+ncr);
    }
    static int factorial(int n)
    {
       int  fact=1;
        for (int i = n; i >0; i--) {
            fact=fact*i;
        }
        return fact;
    }
}
