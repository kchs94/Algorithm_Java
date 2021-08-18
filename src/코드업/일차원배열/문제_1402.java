package 코드업.일차원배열;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
* n개의 데이터를 거꾸로 출력할 수 있는가?
* */
public class 문제_1402 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());    // 문자열 쪼개서 저장
        StringBuilder sb = new StringBuilder();


        // 대입
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 출력
        for(int i=1; i<=n; i++){
           sb.append(arr[n-i] + " ");
        }
        System.out.println(sb);
    }
}
