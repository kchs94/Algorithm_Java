package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 이진탐색
* - 배열의 길이 N 입력받기
* - N개의 원소 입력받기
*
* - 검색횟수 M 입력받기
* - M번 반복하여 입력받은 수가 존재하는지 확인하기
* */
public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length-1;

            while (start <= end) {  // 부등호 주의
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid-1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find)
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }
        System.out.println(sb.toString());
    }
}
