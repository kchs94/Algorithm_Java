package 백준.단계별문제풀이.백트래킹.N퀸;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 1.N을 입력받는다.
* 2.NxN 체스판에 퀸 N개가 서로 공격할 수 없게 배치할 수 있는 경우의 수 를 계산한다.
* 3.모든 경우의 수 갯수를 출력한다.
* */
public class 문제_9663 {
    static int N;
    static int[] arr;   // 값: 행 인덱스: 열
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth){

        // 모든 원소를 다 채운 상황이라면 count 증가 및 return
        if(depth == N){
            count++;
            return;
        }

        for(int i=0; i<N; i++) {    // 행
            arr[depth] = i;

            // 놓을 수 있는 위치일 경우 재귀호출
            if(Possibility(depth)) {    // 검증
                nQueen(depth + 1);
            }
        }
    }

    private static boolean Possibility(int col) {

        for(int i=0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치하는 경우 (같은 행에 존재하는 경우)
            if(arr[col] == arr[i]) {    // 값 비교 = 행 비교
                return false;
            }

            /*
            * 대각선 상에 놓여있을 경우
            * (열의 차와 행의 차가 같은 경우)
            * */
            else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
