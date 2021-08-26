package 코드업.단순반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* q가 입력될 때 까지 입력한 문자 계속 출력하기.
*
* */
public class 문제_1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(true){
            String str = st.nextToken();
            if(str.equals("q")){
                System.out.println(str);
                break;  // 문자열 내용 비교 equals 메소드 사용
            }
            System.out.println(str);
        }
    }
}
