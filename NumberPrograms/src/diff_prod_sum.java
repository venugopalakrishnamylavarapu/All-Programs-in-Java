import java.util.Scanner;

import static java.lang.System.in;

public class diff_prod_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        diff_prod_sum b=new diff_prod_sum();
        System.out.println(b.subtractProductAndSum(a));
    }
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1;
        while(n!=0)
        {
            int last=n%10;
            sum+=last;
            pro*=last;
            n/=10;
        }
        return pro-sum;
    }
}
