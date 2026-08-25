import java.util.Map;
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        return result(s);
    }

    private static int result(String s){
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return i;
            }
        }

        return -1;
    }
}