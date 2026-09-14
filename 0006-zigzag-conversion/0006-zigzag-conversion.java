class Solution {
    public String convert(String s, int numRows) {
        return result(s, numRows);
    }

    private String result(String InS, int InNumRows) {
        if(InNumRows == 1 || InNumRows >= InS.length()) return InS;

  
        StringBuilder[] a = new StringBuilder[InNumRows];
        for(int i = 0; i < InNumRows; i++) {
            a[i] = new StringBuilder();
        }

        int currA = 0;
        boolean down = false; 


        for(char c : InS.toCharArray()) {
            a[currA].append(c); 
            

            if(currA == 0 || currA == InNumRows - 1) {
                down = !down; 
            }
            
            currA += down ? 1 : -1;
        }


        StringBuilder answer = new StringBuilder();
        for(StringBuilder i : a) {
            answer.append(i);
        }

        return answer.toString();
    }
}











