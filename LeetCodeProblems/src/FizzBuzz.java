//412 problem link https://leetcode.com/problems/fizz-buzz/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> li=new ArrayList<String>(n);
        for(int i=1;i<=n;i++)
        {
            boolean div3=(i%3==0);
            boolean div5=(i%5==0);
            if(div3 && div5)
                li.add("FizzBuzz");
            else if(div3)
                li.add("Fizz");
            else if(div5)
                li.add("Buzz");
            else
                li.add(Integer.toString(i));
        }
        return li;
    }
    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(60));
    }
    }
