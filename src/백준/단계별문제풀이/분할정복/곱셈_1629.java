package 백준.단계별문제풀이.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* (A*B)%C = (A%C * A%C)%C
*
* pow 함수 구현
*
* 1.자연수 A B C를 입력받는다. A:밑 B지수
* 2.각 값을 변수에 저장한다.
* 3.거듭제곱 함수를 구현한다.
* 4.함수를 호출한다.
* 5.값을 출력한다.
*
* */
public class 곱셈_1629 {

    static long result = 0;
    static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A,B));
    }

    public static long pow(long A, long B) {

        // 지수가 0인 경우(재귀 탈출 조건)
        if(B == 0){
            return 1;
        }

        // 반으로 나눈 거듭제곱 연산
       long half = pow(A, B / 2);

        // 지수가 짝수
        if(B % 2 == 0) {
            return (half%C  * half%C)%C;
        }
        // 지수가 홀수
        else {
            return (half%C * half%C * A%C)%C;
        }
    }
}
