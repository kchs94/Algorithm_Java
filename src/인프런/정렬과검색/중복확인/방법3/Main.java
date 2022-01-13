package 인프런.정렬과검색.중복확인.방법3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
* 정렬을 통한 중복확인 시간복잡도 : n*logn
* */
public class Main {
    public char solution(int n, int[] arr) {
        char answer ='U';

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer x : arr) {
            if (map.containsKey(x)) {
                answer = 'D';
                return answer;
            }
            map.put(x, 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
