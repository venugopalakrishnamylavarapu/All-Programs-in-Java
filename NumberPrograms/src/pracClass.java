import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class pracClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println();
//        char[] charArray=str.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {
            list.add(str.substring(i,j));
            }
        }
        String str1=(str.contains("hel"))? "true":"false";
        System.out.println(str1);
    }
}

