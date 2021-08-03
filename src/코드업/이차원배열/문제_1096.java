package 코드업.이차원배열;

import java.util.Scanner;

/*
* - 가로,세로 길이가 19인 int형 2차원 배열을 생성합니다.
* - 바둑판에 올려놓을 흰 돌의 개수 n을 입력합니다.(1<=n<=10)
* - n번 반복하여 둘째 줄부터 n+1줄까지 흰 돌을 놓을 (x,y)를 각각 입력합니다.(1<=x,y<=19)
* - 각각의 입력마다 들어온 값을 인덱스로 가지는 원소의 값을 1증가시킵니다.
* - 중첩 반복문을 이용하여 각 원소의 값을 공백으로 분리하여 출력합니다.
* */
public class 문제_1096 {
    public static void main(String[] args) {
        int[][] arr = new int[19][19];  // 바둑판
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 흰 돌 갯수
        int x;
        int y;

        for(int i=0; i<n; i++){
            x = in.nextInt();
            y = in.nextInt();
            arr[x-1][y-1] = 1;    // 흰 돌의 위치
        }

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
