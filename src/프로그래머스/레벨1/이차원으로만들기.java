package 프로그래머스.레벨1;

import java.util.Arrays;

public class 이차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int cnt = 0;
        for(int i = 0 ; i < num_list.length/n ; i++){
            for(int j = 0 ; j < n ; j++){
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        이차원으로만들기 sol = new 이차원으로만들기();
        System.out.println(Arrays.deepToString(sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
}
