package Fundamentals;
import java.util.Stack;

public class Parenthesis {


        public boolean isValid(String s) {
            // A stack to hold the opening brackets
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                // Push opening brackets onto the stack
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                // Handle closing brackets
                else {
                    // If stack is empty, there's no opening bracket to match
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();

                    // Check for mismatch
                    if (c == ')' && top != '(') return false;
                    if (c == '}' && top != '{') return false;
                    if (c == ']' && top != '[') return false;
                }
            }

            // If the stack is empty, all brackets were matched
            return stack.isEmpty();
        }
    }

