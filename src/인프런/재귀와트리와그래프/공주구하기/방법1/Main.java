package 인프런.재귀와트리와그래프.공주구하기.방법1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int n, int k) {
        int answer=0;
        Queue<Integer> q = new LinkedList<>();  // 큐 선언
        for (int i=1; i<=n; i++) {  // 큐 입력
            q.offer(i);
        }

        while (!q.isEmpty()) {  // 큐에 원소가 없을 때까지 반복

            for (int i=1; i<k; i++) // k-1번은 꺼내서 뒤로 다시 넣기
                q.offer(q.poll());
            q.poll();   // 마지막은 없애주기
            if (q.size() == 1)  // 만약 1개만 남았다면
                answer = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        System.out.println(T.solution(N, K));
    }
}
