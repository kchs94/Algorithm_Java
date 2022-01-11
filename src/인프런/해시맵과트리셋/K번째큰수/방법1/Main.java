package 인프런.해시맵과트리셋.K번째큰수.방법1;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private int solution(int n, int m, int[] arr) {
        int answer = -1;    // 만약 k번째 수가 존재하지 않으면 -1
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());   // 내림차순 중복제거

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int index = 0;  // 원소 순서를 추적하기 위한 변수
        for (int x : set) {
            index++;
            if (index == m) return x;
        }

        return answer;
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
