import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        return result(s);
    }

    private static boolean result(String InS){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<InS.length(); i++){
            char c = InS.charAt(i);

            if(c == '(' || c == '{' || c == '[' ) stack.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()) return false;
                
                char top = stack.pop();
                if(( c == ')' && top !='(') || ( c == '}' && top !='{') || ( c == ']' && top !='[')) return false;
            }
        }        
    return stack.isEmpty();
    }
}