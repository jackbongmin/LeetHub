import java.util.Set;
import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        return result(jewels, stones);
    }

    private static int result(String InJewels, String InStones){
        Set<Character> set1 = new HashSet<>();
        int count = 0;

        for(int i = 0; i<InJewels.length(); i++){
            char c = InJewels.charAt(i);
            set1.add(c);
        }

        for(int i = 0; i<InStones.length(); i++){
            if(set1.contains(InStones.charAt(i))) count++;
            // if(set1.contains(InStones[i]))
        }

        return count;
    }
}

