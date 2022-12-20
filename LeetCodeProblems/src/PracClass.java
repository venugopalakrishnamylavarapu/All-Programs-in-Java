//this is a practice class so this does not contain any leetcode problem solutions
import java.util.*;

import static java.lang.System.in;

public class PracClass {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}";
       // String str="{)";
        System.out.println(new PracClass().isValid(str));
    }

}

