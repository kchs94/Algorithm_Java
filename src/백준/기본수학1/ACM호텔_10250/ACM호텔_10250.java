package 백준.기본수학1.ACM호텔_10250;

/*
* 입력: T: 테스트 케이스 갯수, H:층 수, W: 방 갯수, N: N번째 손님
* 출력: N번째 손님에게 배정되어야 하는 방 번호
* 조건: 방번호: YXX, YYXX형태
* 알고리즘:
* 1.테스트 케이스 T를 입력받는다.
* 2.층수, 방 갯수, 몇번째 손님인지 입력받는다.
*
*
* 5.방 번호를 출력한다.
* */

import java.util.Scanner;

public class ACM호텔_10250 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int T = in.nextInt();


       int[][] arr = new int[100][100]; // 100x100 2차원 배열 생성
       for(int i=0; i<100; i++){    // 초기화
           arr[i][0] = 0;
           arr[0][i] = 0;
       }
       // T번 반복
       for(int i=0; i<T; i++){
           int H = in.nextInt();
           int W = in.nextInt();
           int N = in.nextInt();

            int Y,X;
            if(N%H == 0){
                Y = H;
                X = N/H;
            } else{
                Y = N%H;
                X = N/H + 1;
            }

            if(0<X && X<10) System.out.println(Y + "0" + X);
            else System.out.println(Y + "" + X);
       }
    }
}
