import java.util.Scanner;

public class oddposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumeven=0,sumodd=0,remainder,count=0;
        while(n!=0)
        {
            remainder=n%10;
            count++;
            if(count%2==0)
            {
               sumeven+=remainder;
            }
            else if(count%2!=0)
            {
                sumodd+=remainder;
            }
           n=n/10;
        }
        if(sumeven==sumodd)
        {
            System.out.println("Sum are equal");
        }
        else if(sumeven!=sumodd)
        {
            System.out.println("Sum are not equal");
        }
    }
}
