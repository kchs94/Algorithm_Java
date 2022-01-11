package 인프런.투포인터와슬라이딩윈도우.연속부분수열.방법1;

import java.util.Scanner;

public class Main {
    public int solution(int N, int M, int[] arr) {
        int count = 0;
        int sum = 0;
        int start = 0;

        for (int end=0; end < N; end++ ) {
            sum += arr[end];
            if (sum == M) count++;  // 같다면
            while (sum>=M) {    // 합이 더 크다면
                sum -= arr[start++];
                if (sum == M) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int M = in.nextInt();
        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(N, M, arr));
    }
}
