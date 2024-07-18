package top75.week1;

import java.util.Map;
import java.util.Stack;

/*
*
*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type
* */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[]{}"));
        System.out.println(isValid("[]{}}}"));
        System.out.println(isValid("[]{}[]()"));
        System.out.println(isValid("[]{]"));

        System.out.println(isValid("{[]}"));
        System.out.println(isValid("([}}])")); // false
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of('}', '{',
                ')', '(',
                ']', '[');


        for (char symbol : s.toCharArray()) {
            if (symbol == '{' || symbol == '(' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == '}' && !stack.isEmpty() && stack.peek() == map.get(symbol)) {
                stack.pop();
            } else if (symbol == ')' && !stack.isEmpty() && stack.peek() == map.get(symbol)) {
                stack.pop();
            } else if (symbol == ']' && !stack.isEmpty() && stack.peek() == map.get(symbol)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
