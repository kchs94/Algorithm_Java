package 붓캠.데일리.fibonacci_23;

public class Solution {

    public int[] dp;

    public int recursive(int num) {
        if(num == 0 || num == 1) {
            return dp[num] = num;
        }
        else {
            if (dp[num] != 0)
                return dp[num];
            dp[num] = recursive(num-1) + recursive(num-2);
            return dp[num];
        }
    }

    public int fibonacci(int num) {
        int answer = 0;
        dp = new int[num+1];

        answer = recursive(num);

        return answer;
    }
}
