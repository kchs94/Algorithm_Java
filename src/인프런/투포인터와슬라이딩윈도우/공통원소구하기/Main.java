package 인프런.투포인터와슬라이딩윈도우.공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* - A 배열을 정렬합니다.
* - B 배열을 정렬합니다.
* - p1<n && p2<m일 상태를 유지하는 동안 반복합니다.
* - A[p1] == B[p2]이면 해당 값을 리스트에 넣습니다.
* - A[p1]>B[p2]이면 p2를 1 증가합니다.
* - A[p1]<B[p2]이면 p1을 1 증가합니다.
*
*
* */
public class Main {
    public static ArrayList<Integer> solution(int n, int[] A, int m, int[] B) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);

        while(p1<n && p2<m) {
            if (A[p1] == B[p2]) {
                list.add(A[p1]);
                p1++;
                p2++;
            }
            else if(A[p1] > B[p2]) p2++;
            else p1++;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] B = new int[m];
        for (int i=0; i<m; i++) {
            B[i] = in.nextInt();
        }
        for (int x : solution(n,A,m,B)) {
            System.out.print(x + " ");
        }
    }
}