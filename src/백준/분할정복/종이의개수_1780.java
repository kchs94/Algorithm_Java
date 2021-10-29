package 백준.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 분할정복
* 1.판단
* 2.분할
*
* 수도코드
* 1.종이 크기 N을 입력받는다.o
* 2.N번 반복하여 행단위로 입력받는다.o
* 3.종이가 모두 같은 수로 되어 있는지 판단한다.
* 4.만약 같은 수로 안되어 있다면 9개로 자르고 (3)번 과정을 반복한다.
* 5.이와같이 한 후 -1로만 채워진 종이의 갯수, 0으로만 채워진 종이의 갯수, 1로만 채워진 종이의 갯수를 각 행별로 출력한다.o
* */
public class 종이의개수_1780 {

    static int[][] arr;
    static int minusOne = 0;
    static int zero = 0;
    static int one = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        StringBuilder sb = new StringBuilder();
        sb.append(minusOne + "\n");
        sb.append(zero + "\n");
        sb.append(one + "\n");
        System.out.println(sb);
    }

    public static void partition(int row, int col, int size) {

        // 1.종이가 같은 수로 되어 있는지 판단

        if(isSameValue(row, col, size)) {

            if(arr[row][col] == -1)
                minusOne++;
            else if(arr[row][col] == 0)
                zero++;
            else
                one++;

            return;
        }

        // 2.분할

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize*2, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + newSize*2, newSize);
        partition(row + newSize*2, col, newSize);
        partition(row + newSize*2, col + newSize, newSize);
        partition(row + newSize*2, col + newSize*2, newSize);
    }

    public static boolean isSameValue(int row, int col, int size) {

        int value = arr[row][col];

        for(int i = row; i < row + size; i++) {

            for( int j = col; j < col + size; j++) {

                if(arr[i][j] != value) {
                    return false;
                }
            }
        }

        return true;
    }
}
