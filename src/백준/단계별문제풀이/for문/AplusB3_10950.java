package 백준.단계별문제풀이.for문;

import java.util.Scanner;

public class AplusB3_10950 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();   // 테스트 케이스 갯수 T 입력받기

        for(int i=0; i<T; i++){ // T번 두 수의 합 입력 받고 출력하기
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A+B);
        }
    }
}
