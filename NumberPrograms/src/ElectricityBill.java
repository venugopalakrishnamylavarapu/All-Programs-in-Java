import java.util.Scanner;

import static java.lang.System.in;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number of units consumed:-");
        double a=sc.nextDouble();
        System.out.println("Enter the charge for 1 unit:-");
       double b=sc.nextDouble();
        bill(a,b);
    }

     static void bill(double a,double b) {
        double bill=a*b;
         System.out.println("The total charge you need to par is :-"+bill+"Rs\\-");
    }
}
