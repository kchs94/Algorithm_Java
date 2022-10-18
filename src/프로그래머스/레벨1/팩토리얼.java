package 프로그래머스.레벨1;

public class 팩토리얼 {
    static int[] dp = new int[11];

    public int solution(int n) {
        int answer = 0;
        factorial(10);
        for (int i=10; i>=0; i--) {
            if (n >= dp[i])
                return i;
        }
        return answer;
    }

    public static int factorial(int num) {
        if (num == 0)
            return dp[0] = 1;
        else {
            return dp[num] = num * factorial(num-1);
        }
    }

}
