class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return result(s1, s2);
    }

    private boolean result(String InS1, String InS2){
        int len1 = InS1.length();
        int len2 = InS2.length();

        if(len1 > len2) return false;

        int[] count = new int[26];

        for(int i = 0; i < len1; i++){
            count[InS1.charAt(i) - 'a']++;
            count[InS2.charAt(i) - 'a']--;
        }

        int a = 0;
        for(int i=0;i<26;i++){
            if(count[i] != 0) a++;
        }

        if(a==0) return true;

        for(int i = len1; i< len2; i++){
            int right = InS2.charAt(i) - 'a';
            int left = InS2.charAt(i - len1) - 'a';

            if(right == left) continue;

            if(count[right] == 0) a++;
            count[right]--;
            if(count[right] == 0) a--;

            if(count[left] == 0) a++;
            count[left]++;
            if(count[left] == 0) a--;

            if(a == 0) return true;
        }
        return false;
    }
}