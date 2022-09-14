package StarPatterns;

import javax.naming.PartialResultException;

public class Pattern {
    public static void main(String[] args) {
        pattern3(5);
    }
    //pattern1
    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //pattern 2
    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//pattern 3
    static void pattern3(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j=n;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
