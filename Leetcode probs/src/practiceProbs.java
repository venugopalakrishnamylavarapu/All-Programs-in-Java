import java.util.Scanner;

public class practiceProbs {


    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        countPrimes(n);
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for (int i = 2; i < n; i++) {
                if(n%i==0)
                {
                    return false;
                }
            }
            }
        return true;
        }

    private static int countPrimes(int n) {
        int count=0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}

