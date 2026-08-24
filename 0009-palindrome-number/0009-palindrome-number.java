import java.util.Stack;

class Solution {

    public boolean isPalindrome(int x) {
        return result(x);
    }

    private static boolean result(int InX){

        Stack<Character> s = new Stack<>();
        String string_InX1 = String.valueOf(InX);
        String string_InX2 = "";

        if(InX< 0) return false;

        for(int i = 0; i<string_InX1.length(); i++){
            char c = string_InX1.charAt(i);
            s.push(c);
        }     
        for(int i = 0; i<string_InX1.length(); i++){
            char c = s.pop();
            string_InX2 += c;
        }

        if(string_InX1.equals(string_InX2)){
            return true;
        }
        else{
            return false;
        }
    }
}