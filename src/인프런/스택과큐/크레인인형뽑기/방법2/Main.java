package 인프런.스택과큐.크레인인형뽑기.방법2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int N, int[][] board, int M, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {    // 크레인의 이동 횟수만큼 반복

            for (int i=0; i<N; i++) {

                if (board[i][move-1] != 0) {
                    int temp = board[i][move-1];
                    board[i][move-1] = 0;

                    if (!stack.isEmpty() && temp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] board = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int M = in.nextInt();
        int[] moves = new int[M];
        for (int i=0; i<M; i++) {
            moves[i] = in.nextInt();
        }
        System.out.print(T.solution(N, board, M, moves));
    }
}
