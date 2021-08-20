package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 출제의도:
* */
public class 문제_1405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 크기 n 배열 선언
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        // 출력
        for(int i=0; i<n; i++){
           for(int j=i; j<n; j++){
                sb.append(arr[j] + " ");
           }
           for(int k=0; k<i; k++){
               sb.append(arr[k] + " ");
           }
           sb.append("\n");
        }
        System.out.println(sb);
    }
}
