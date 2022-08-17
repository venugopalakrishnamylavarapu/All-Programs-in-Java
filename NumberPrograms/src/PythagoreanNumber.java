import java.util.Scanner;

import static java.lang.System.in;

public class PythagoreanNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the first number:-");
        int a=sc.nextInt();
        System.out.println("Enter the second number:-");
        int b=sc.nextInt();
        System.out.println("Enter the third number:-");
        int c=sc.nextInt();
        pythagoreanNumber(a,b,c);
    }
    static void pythagoreanNumber(int a,int b,int c)
    {
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
        {
            System.out.println("The triplets are Pythagoraen triplets");
        }
        else
            System.out.println("Not a Pythagorean triplets");
    }
}
