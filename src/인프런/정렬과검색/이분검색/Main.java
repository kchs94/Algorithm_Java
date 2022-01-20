package 인프런.정렬과검색.이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int N, int M, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);   // 정렬
        int lt = 0, rt =arr.length-1;
        while (lt <= rt) {  // 이분탐색 시작
            int mid = (lt + rt) / 2;
            if (arr[mid] < M) { // 중간 값이 찾는 값보다 작다면
                lt = mid + 1;
            }
            else if(arr[mid] > M) { // 중간 값이 찾는 값보다 크다면
                rt = mid - 1;
            }
            else {  // 찾는 값이라면
                answer = mid + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(N,M,arr));
    }
}
