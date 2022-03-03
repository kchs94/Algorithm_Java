package 백준.단계별문제풀이.브루트포스.체스판다시칠하기_1018;
/*
* 문제: 다시 칠해야 하는 정사각형의 최소 개수를 구하세요.
* 입력: 첫째 줄: N M  (8<=N,M<=50), 둘째 줄부터 N개의 줄: 보드의 각 행의 상태, B=검은색,W=하얀색
* 출력: 다시 칠해야 하는 정사각형의 최소 개수를 출력한다.
* 조건:
* 1.8*8 체스판
* 2.검은색 흰색 번갈아가면서 칠해진다.
* 2-1.맨 왼쪽 위 칸 = 흰색
* 2-2.맨 왼쪽 위 칸 = 검은색
* 알고리즘:
* 1.경우의 수 = (가로 칸 개수 -7) * (세로 칸 개수 -7) * 2(흑/백)
* 2. boolean 2차원 배열, W:true, B:false
* 3. 8x8 배열의 원소 하나씩 검사하면서 첫 칸의 색이 하얀색일 경우와 검은색일 경우의 수를 비교하여 최솟값 구하기
* */

import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    public static boolean[][] arr;  // 왜 메인 메소드 밖에..?
    public static int min = 64; // 최솟값을 일단 최댓값으로 맞춘다.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        arr = new boolean[N][M];
        /*
        * Scanner의 경우 공백자로 구분하다가
        * 개행이 입력되면 스트림에 개행이 남으면서
        * 의도와 달리 첫 번째 String 입력은 개행이 저장됩니다.
        * 그렇기 때문에 nextLine()을 이용하여
        * 문자열 입력 전 int와 String 입력 사이의 개행을 없애주도록 합니다.
        */
        in.nextLine();

        // 배열 입력
        for(int i=0; i<N; i++){
            String str = in.nextLine().trim();

            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){   //W일 때 true
                    arr[i][j] = true;
                } else {                // B일 때 false
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N-7;
        int M_col = M-7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j<M_col; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }


    public static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count=0;

        boolean TF= arr[x][y];  // 첫 번째 칸의 색

        for(int i=x; i<end_x; i++){
            for(int j=y; j<end_y; j++){

                // 올바른 색이 아니면 count 1
                if(arr[i][j] != TF){
                    count ++;
                }

                /*
                * 다음 칸은 색이 바뀌므로
                * true라면 false로, false라면 true로
                * 값을 변경합니다.
                * */
                TF = (!TF);
            }

            TF = !TF;
        }

        /*
        * 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
        * 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
        * 색칠 할 개수(64-count) 중 최솟값을 count에 저장합니다.
        * */

        count = Math.min(count, 64- count);

        /*
        * 이전까지의 경우 중 최솟값보다 현재 count 값이
        * 더 작을 경우 최솟값을 갱신한다.
        * */

        min = Math.min(min, count);
    }
}
