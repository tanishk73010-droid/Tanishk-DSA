import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            // If it's a closing bracket, it MUST match the popped character
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        
        return stack.isEmpty();
    }
}