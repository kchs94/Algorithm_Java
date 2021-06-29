package 백준.for문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB7_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st; // 행단위로 입력받는 문자열을 공백단위로 입력받기 위해

        for(int i=1; i<=T; i++){
            st = new StringTokenizer(br.readLine(), " ");   //문자열 구분 기준은 ' '
            System.out.println("Case #" + i + ": " + (Integer.parseInt(st.nextToken())
            + Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
