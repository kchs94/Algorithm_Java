package 코드업.입출력및연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 주의할점
* 덧셈할 때 오버플로우 주의한다.
*
* */
public class 문제_1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        long sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println(sum);
        System.out.println(Math.round(average*10)/10.0);
    }
}
