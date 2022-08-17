import java.util.*;

import static java.lang.System.in;

public class until0pressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int sum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
//        while(true)                   //for sum of the integers until user enters 0.
//        {
//            int n=sc.nextInt();
//            if(n!=0)
//            {
//             sum+=n;
//             continue;
//            }
//            else
//                System.out.println(sum);
//                break;
//        }
        while(true)                     //for the largest number among the user inputs until user presses 0.
        {
            int n=sc.nextInt();
            if(n!=0)
            {
                list.add(n);
                continue;
            }
            else
                System.out.println(Collections.max(list));
            break;
        }
    }
}
