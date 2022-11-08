package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 최솟값을 만드려면 +연산자를 중심으로 먼저 두 피연산자를 계산한 뒤 나온 결과값을 마지막에 - 연산처리하면 된다.
*
* 문자열을 입력받는다
* 문자열을 '-'을 구분자로 하여 나눈다.
* 나눈 문자열을 가지고 '+'을 구분자로 하여 나눈다.
* 나눈 문자열들의 합을 구한다.
* */
public class 잃어버린괄호_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;

        String[] arr = input.split("-");    // 10, 20+30+40
        for (int i=0; i<arr.length; i++) {
            int sum = sum(arr[i]);

            if (i == 0)
                answer += sum;
            else
                answer -= sum;
        }
        System.out.println(answer);
    }

    public static int sum(String str) {
        int sum = 0;
        String[] numArr = str.split("\\+");
        for (String num : numArr) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
