//434.problem link https://leetcode.com/problems/number-of-segments-in-a-string/description/
/*
434. Number of Segments in a String

Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 

Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

Example 2:

Input: s = "Hello"
Output: 1

 

Constraints:

    0 <= s.length <= 300
    s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
    The only space character in s is ' '.


 */
    public class NumberOfSegmentsInTheString {
    public int countSegments(String s) {
        if(s==null ||s.length()==0)   return 0;
        int segments=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1)==' '))  segments++;
        return segments;
    }
}
