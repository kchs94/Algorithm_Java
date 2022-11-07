package 프로그래머스.레벨1;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for (int i=1; i<=num; i++) {
            total -= i;
        }

        int n = total / num;

        for (int i=0; i<=num; i++) {
            answer[i] = n + i;
        }

        return answer;
    }
}
