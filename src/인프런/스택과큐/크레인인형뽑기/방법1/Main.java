package 인프런.스택과큐.크레인인형뽑기.방법1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int N, int[][] board, int M, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int answer = 0;


        // 크레인 움직인 횟수만큼 반복
        for (int move : moves) {

            for (int i=0; i<N; i++) {

                if (board[i][move-1] == 0)
                    continue;
                else {
                    if (board[i][move-1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
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
