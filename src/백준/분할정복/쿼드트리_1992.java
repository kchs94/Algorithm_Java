package 백준.분할정복;
/*
* 분할정복 문제
* 1.현재 풀 수 있는가?
* 2.분할한다
* 3.다시 1로 가서 반복한다.
*
* 1.2차원 배열의 크기 N을 입력받는다.
* 2.N번 행별로 입력받는다.
* 3.2차원 배열에 값을 할당한다.
* 4.현재 크기에서 분할 함수를 호출한다.
* 5.첫번째 원소를 기준으로 모든 원소가 값이 같은지 판단한다.
* 6.0으로 같다면 0을 출력한다.
* 7.1으로 같다면 1을 출력한다.
* 6.같지 않다면 배열의 크기를 절반으로 줄여서 4번 재귀호출한다.
* 5.영상을 압축한 결과를 출력한다.
* 
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 쿼드트리_1992 {

    static int[][] arr;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        partition(0, 0, N);

        System.out.println(sb);
    }

    public static void partition(int row, int col, int size) {

        // 1.판단
        if(sameValue(row, col, size)) {
            if(arr[row][col] == 0)
                sb.append("0");
            else
                sb.append("1");
            return;

        }
        
        // 2.분할
        int newSize = size / 2;

        sb.append("(");

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);

        sb.append(")");
    }

    public static boolean sameValue(int row, int col, int size) {

        // 기준은 첫행
        int value = arr[row][col];

        for(int i = row; i<row + size; i++) {
            for(int j = col; j<col + size; j++) {

                if(arr[i][j] != value)
                    return false;
            }
        }

        return true;
    }
}
