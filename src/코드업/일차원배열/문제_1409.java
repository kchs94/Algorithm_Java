package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class 문제_1409 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    // 입력 문자열 분리

        int[] arr = new int[st.countTokens()];  // 배열 생성

        // 배열에 값 할당
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());  // 문자열 --> int
        }

        int k = Integer.parseInt(br.readLine());

        System.out.println(arr[k-1]);
    }
}
