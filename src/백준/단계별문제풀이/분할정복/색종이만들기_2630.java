package 백준.단계별문제풀이.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 색종이만들기_2630 {

    static int[][] arr;
    static int numOfWhite = 0;
    static int numOfBlue = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(numOfWhite);
        System.out.println(numOfBlue);
    }

    public static void partition(int row, int col, int size) {

        // 1.같은 색인가?
        if(colorCheck(row, col, size)) {
            if(arr[row][col] == 0) {
                numOfWhite++;
            }
            else {
                numOfBlue++;
            }
            return;
        }

        // 2.분할
        int newSize = size / 2; //절반 사이즈

        // 재귀 호출
        partition(row, col, newSize);       //1
        partition(row, col + newSize, newSize); //2
        partition(row + newSize, col, newSize); //3
        partition(row + newSize, col + newSize, newSize);   //4
    }

    public static boolean colorCheck(int row, int col, int size) {

        // 첫 번째 원소를 기준으로 같은 색인지 검사
        int color = arr[row][col];  

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {

                // 컬러가 다르면 false로 함수 종료
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        // 반복문을 통과하면 컬러가 다른게 없었으니깐 참
        return true;
    }
}
