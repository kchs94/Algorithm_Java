package 프로그래머스.레벨1.최대공약수와최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // n:큰 값 m:작은 값
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }

        answer[0] = getGCD(n,m);
        answer[1] = getLCM(n,m);
        return answer;
    }

    public static int getGCD(int big, int small){
        int GCD=0;
        for(int i=1; i<=small; i++){
            if(big%i == 0 && small%i == 0)
                GCD = i;
        }
        return GCD;
    }

    public static int getLCM(int big, int small){
        int LCM=0;
        LCM = (big*small)/getGCD(big, small);
        return LCM;
    }
}
