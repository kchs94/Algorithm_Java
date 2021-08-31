package 코드업.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문제_1492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        st = new StringTokenizer(br.readLine());

        int sum=0;

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++){
            sum+= arr[i];
            sb.append(sum + " ");
        }
        System.out.println(sb);


    }
}
