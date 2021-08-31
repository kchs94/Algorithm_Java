package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 문제_1425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfStd = Integer.parseInt(st.nextToken());
        int oneLineStd = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] sortedStd = new int[numOfStd];
        for(int i=0; i<numOfStd; i++){
            sortedStd[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedStd);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numOfStd; i++){
            sb.append(sortedStd[i] + " ");
            if((i+1)%oneLineStd== 0) sb.append("\n");
        }
        System.out.println(sb);

    }
}
