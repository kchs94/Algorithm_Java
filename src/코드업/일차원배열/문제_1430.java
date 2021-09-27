package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 해시맵배우고 풀기
* */
public class 문제_1430 {
    public static void main(String[] args) throws IOException {
        boolean[] nums = new boolean[10000001];
        nums[0] = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[Integer.parseInt(st.nextToken())] = true;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            if(nums[Integer.parseInt(st.nextToken())] == true)
                sb.append("1 ");
            else
                sb.append("0 ");
        }
        // 출력
        System.out.println(sb);
    }
}
