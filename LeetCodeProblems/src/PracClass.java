//this is a practice class so this doesnot contain any leetcode problem solutions
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class PracClass {
    public static int meth1(String str)
    {
        if(str.length()==0)
            return 0;
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
    String str1="Hello, my name is venu";
    String str2="Hello";
    String str3="love live! mu'sic forever";
    String str4="";
        System.out.println(new PracClass().meth1(str1));
        System.out.println(new PracClass().meth1(str2));
        System.out.println(new PracClass().meth1(str3));
        System.out.println(new PracClass().meth1(str4));

    }

}

