package 백준.단계별문제풀이.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AplusB8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 첫째 줄에 테스트 케이스 개수 T가 주어진다

        int A;  //반복문 들어가기 전에 미리 선언
        int B;

        StringTokenizer st;     //행으로 입력받는 문자열을 공백기준으로 입력받기 위해
        for(int i=1; i<=T; i++){
           st = new StringTokenizer(br.readLine(), " ");
           A = Integer.parseInt(st.nextToken());    // 2번 이상 호출할 경우라면 변수에 담는다.
           B = Integer.parseInt(st.nextToken());
           System.out.println("Case #" + i + ": " + A + " + " + B
           + " = " +(A+B)); // A와 B가 2번 각각 2번이상 호출되었다.
        }
        br.close();
    }
}
