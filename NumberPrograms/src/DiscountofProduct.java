import java.util.Scanner;

import static java.lang.System.in;

public class DiscountofProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the price of the product:-");
        double n=sc.nextDouble();
        System.out.println("Enter the discount of the product:-");
        double m=sc.nextDouble();
        discount(n,m);
    }
    static void discount(double a,double b)
    {
        double dis=(a*b)/100;
        double price=a-dis;
        System.out.println("The price of the product with discount is:-"+price);
    }
}
