package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열의 크기와 원소를 입력받고 출력할 수 있는가?
public class 문제_1403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sb.append(arr[i] + "\n");
        }

        System.out.print(sb);
        System.out.print(sb);

    }
}
