package 코드업.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 1.년도 월 일을 입력받는다.
* 2. 문자열을 공백을 기준으로 쪼갠다.
* 3. 만약 년도 - 월 + 일의 마지막 숫자가 0이면 "대박", 그렇지 않으면 "그럭저럭"을 출력한다
*
* */
public class 문제_1162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력 준비
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());    // 년
        int month = Integer.parseInt(st.nextToken());   // 월
        int day = Integer.parseInt(st.nextToken());     // 일

        if((year - month + day)%10 == 0)
            System.out.println("대박");
        else
            System.out.println("그럭저럭");
    }
}
