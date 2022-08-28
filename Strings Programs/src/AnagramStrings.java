import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class AnagramStrings {
    //Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
    //process:-
    /*In this program, our task is to check for two strings that, they are the anagram or not. For this purpose, we are following a simpler approach.
    First of all, Compare the length of the strings,
     if they are not equal in the length then print the error message and make an exit, otherwise, convert the string into lower-case for the easy comparisons.
    Sort both the strings using bubble sort or other sorting methods. If the strings are found to be identical after sorting,
    then print that strings are anagram otherwise print that strings are not the anagram.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the first string:");
        String str1=sc.nextLine();
        System.out.println("Enter the second string:");
        String str2=sc.nextLine();

        if(str1.length()!=str2.length())
        {
            System.out.println("The given two strings are not anagram:");
            System.exit(0);
        }

        //converting the two strings to chararray
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        //sorting the array of characters according to dictionary
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //checking the condition
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("The given two strings are anagram");
        }
        else
            System.out.println("The given two strings are not anagram");

    }
}
