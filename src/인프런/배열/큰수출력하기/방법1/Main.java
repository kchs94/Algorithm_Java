package 인프런.배열.큰수출력하기.방법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 왼쪽이 앞, 오른쪽이 뒤
* */
public class Main {

    public String solution(int num, int[] nums) {
        StringBuilder sb = new StringBuilder();

        sb.append(nums[0] + " ");

        for(int i=1; i<nums.length; i++) {

            if(nums[i-1] < nums[i]) {
                sb.append(nums[i] + " ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Main T = new Main();
        System.out.println(T.solution(N, nums));
    }
}
