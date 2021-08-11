package 코드업.입출력및연산자;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// .은 메타 문자이므로 백슬레시를 2번 붙여줘야 일반적인 .을 나타낸다.
public class 문제_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("\\.");    // .을 기준으로 문자열을 분리합니다.

        System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);   // 결과 출력
    }
}
