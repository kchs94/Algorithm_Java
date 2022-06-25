package 프로그래머스.고득점키트.깊이너비우선탐색.타겟넘버;
/*
* 문자가 3개면 각각 2가지 경우가 있으니깐 총 2^3=8가지 경우를 DFS로 탐색한다.
*
* 배열의 원소의 갯수만큼 DFS을 한다.
* 앞 원소부터 차례대로 더할지 뺄지 2가지 길로 나눈다.
* 최종 결과값이 타겟 넘버면 카운트를 해준다.
* */
public class Solution {
    int[] numbers;
    int target;
    int answer = 0;

    public void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        else {
            dfs(index + 1, sum + numbers[index]);
            dfs(index + 1, sum - numbers[index]);
        }
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1,1,1,1,1}, 3));
    }
}