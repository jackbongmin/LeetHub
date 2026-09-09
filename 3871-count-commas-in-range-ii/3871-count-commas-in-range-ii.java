class Solution {
    public long countCommas(long n) {
        return result(n);
    }

    private long result(long InN){
        long answer = 0;
        long b = 1000;

        while(InN>=b){
            answer += (InN - b + 1);

            if(b > Long.MAX_VALUE / 1000) break;

            b *= 1000;
        }

        return answer;
    }
}

// 입력값 - 1000^n + 1