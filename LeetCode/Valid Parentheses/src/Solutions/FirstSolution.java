package Solutions;

import java.util.*;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class FirstSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(') {

                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        FirstSolution test = new FirstSolution();
        System.out.println(test.isValid("]"));
    }
}

