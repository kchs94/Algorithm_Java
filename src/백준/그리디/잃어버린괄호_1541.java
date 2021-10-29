package 백준.그리디;
/*
* 그리디 알고리즘
* 
* 식을 입력받는다.
* '-'를 기준으로 문자열을 분리한다.
* 분리된 문자열 중 '+'가 있는 문자열을 '+'기준으로 분리한다.
* +가 있었던 문자열숫자들을 다 더해준다.
* 나머지 분리된 문자열 숫자들을 첫번째 문자열에서 다 빼준다.
* 출력한다.
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
// 1+2-3+4+1
public class 잃어버린괄호_1541 {
    public static void main(String[] args) throws IOException {
        int sum = Integer.MAX_VALUE;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");

        while(subtraction.hasMoreTokens()) {
            int temp = 0;

            // 뺄셈으로 나눈 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            while(addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}
