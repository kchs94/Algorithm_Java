package 붓캠.데일리;
/*
* 1.분석
* - LIS 문제 --> dp 문제
* - dp[i]: i번째 요소를 마지막으로하는 최대 증가 수열의 길이
* */
public class LIS_49 {
    public int LIS(int[] arr) {
        int answer = 1;

        int[] dp = new int[arr.length];
        dp[0] = 1;

        for (int i=1; i<arr.length; i++) {
            int max = 0;
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i] && dp[j] > max) max = dp[j];
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        LIS_49 sol = new LIS_49();
        System.out.println(sol.LIS(new int[]{3,4}));
    }
}
