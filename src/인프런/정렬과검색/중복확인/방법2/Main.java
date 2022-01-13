package 인프런.정렬과검색.중복확인.방법2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
* 정렬을 통한 중복확인 시간복잡도 : n*logn
* */
public class Main {
    public char solution(int n, int[] arr) {
        char answer ='U';

        Arrays.sort(arr);

        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]){
                answer ='D';
                return answer;
            }
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
