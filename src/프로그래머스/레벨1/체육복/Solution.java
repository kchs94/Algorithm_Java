package 프로그래머스.레벨1.체육복;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        int answer = n;

        for (int num : lost)
            student[num-1]--;
        for (int num : reserve)
            student[num-1]++;

        for (int i=0; i<n; i++) {
            if (student[i] == -1) {
                if (i-1>=0 && student[i-1] == 1) {
                    student[i]++;
                    student[i-1]--;
                } else if (i+1 < n && student[i+1] == 1) {
                    student[i]++;
                    student[i+1]--;
                } else
                    answer--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

//        int[] lost1 = {2,4};
//        int[] reserve1 = {1, 3, 5};
//        System.out.println(s.solution(5, lost1, reserve1));
//
//        int[] lost2 = {2,4};
//        int[] reserve2 = {3};
//        System.out.println(s.solution(5, lost2, reserve2));

        int[] lost3 = {1,3,5};
        int[] reserve3 = {2,4,6};
        System.out.println(s.solution(6, lost3, reserve3));
    }
}
