import java.util.Scanner;

import static java.lang.System.in;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
