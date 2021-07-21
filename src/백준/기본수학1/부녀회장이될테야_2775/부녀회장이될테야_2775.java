package 백준.기본수학1.부녀회장이될테야_2775;

import java.util.Scanner;

/*  a=2 b=3일때,
* 예1) 2층의 3호에 살려면, 1층의 1호부터 3호까지  사람들 수의 합만큼 사람들을 데려와 살아야 한다.
* 조건: 비어있는 집은 없다. 아파트는 0층부터 있고 각 층에는 1호부터 시작, 0층의 i호에는 i명이 산다.
* 입력: 첫번째 줄에 T: 테스트 케이스 갯수, 첫 번째 줄에 정수 k, 두 번재 줄에 정수 n ( 1<= k,n<=14)
* 출력: 각 테스트 케이스에 대해서 해당 집에 거주민 수를 출력함
* */
public class 부녀회장이될테야_2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[][] APT = new int[15][15];  // 표를 만들기 위해
        int k = 0;
        int n = 0;

        // 초기화
        for(int i=1; i<15; i++){
            APT[i][1] = 1;  // i층 1호
            APT[0][i] = i;  // 0층 i호
        }

        // 알고리즘
        for(int i=1; i<15; i++){    // 층
            for(int j=2; j<15; j++){    // 호
                APT[i][j] = APT[i][j-1] + APT[i-1][j];  // 왼쪽 호실 + 아래 호실
            }
        }

        // 테스트 케이스 T만큼 반복
        for(int i=0; i<T; i++){
            k = in.nextInt();   // 층
            n = in.nextInt();   // 호
            System.out.println(APT[k][n]);
        }
        in.close();
    }
}
