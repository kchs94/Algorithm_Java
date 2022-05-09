package 십일번가.문제2;

public class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int count = 0;
        for (int i=0; i<A.length; i++) {
            sum+= A[i];
            if (sum == (i+1)*(1+i+1)/2) // 항수*(1+끝항값)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {2,3,4,1,5};
        System.out.println(solution(A));
    }
}
