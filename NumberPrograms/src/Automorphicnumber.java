import java.util.Scanner;

import static java.lang.System.in;

public class Automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the number ot be checked:");
        int a=sc.nextInt(),count=0;
        int square=a*a;
        int temp=a;                 //temp variable loki mana inputni assign cheyskunnam.because,while loop ipoyaka mana a value 0 avuthundi
        while (temp>0) {
            int temp1=temp%10;          //last digit tiskuntaniki mana input number lo
            int last=square%10;         //last digit tiskuntaniki square chesina number lo
            if (temp1 !=last) {     //ikkada comparision lo equal avakapothey count penchutam
                count++;
            }
            temp=temp/10;
            square=square/10;
        }
        if(count==0)                //count value pergakapothey adi anni last digits match cheystunnatu so automorphic
        {
            System.out.println("The numberis automorphic");
        }
        else
            System.out.println("Not an automorphic number");
    }
}
