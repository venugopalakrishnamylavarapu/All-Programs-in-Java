import java.util.Scanner;

import static java.lang.System.in;

public class PowerOfNumber {
    public static void main(String[] args) {        //we can also use Math.pow(number,power) and print the value but it should be in double value
        Scanner sc=new Scanner(in);
        int prod=1;
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        System.out.println("Enter the power of the number:-");
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            prod=prod*n;
        }
        System.out.println("The power of "+m+" to "+n+" is:"+prod);
        System.out.println();
        System.out.println();
        double power=Math.pow(n,m);
        System.out.println("By using Math.pow() method the value is:-");
        System.out.println(power);
    }
}
