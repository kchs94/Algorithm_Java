package 인프런.투포인터와슬라이딩윈도우.두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 투포인터 알고리즘 --> 정렬(nlogn)보다 더 빠르다 O(n)
* 정렬의 경우 빨라 봐야(퀵정렬) O(nlogn)인데 투포인터 알고리즘을 사용하면 O(n)으로 낮출 수 있다.
* 두 개의 포인터를 사용해서 배열의 원소에 접근하는 알고리즘
* 포인터 역할을 하는 인덱스 변수 두 개를 선언해서 푼다.
*
* p1과 p2를 0으로 초기화한다.
*
* - p1<n이고 p2<m을 유지하는 동안 계속 반복한다.
*   - A[p1] < B[p2]이면 A[p1]을 리스트에 넣고 p1값을 1증가시킨다.
*   - 이 외의 경우 B[p2]를 리스트에 넣고 p2 값을 1 증가시킨다.
* // 두 배열의 인덱스가 끝에 도달된 경우(=어느 배열이 도달 됬는지는 모르니깐 두 배열 모두 시도한다)
* p1<n인 상태동안 A[p1]을 리스트에 넣고 p1 값을 1증가시킨다
* p2<m인 상태동안 B[p2]을 리스트에 넣고 p2 값을 1증가시킨다
* */
public class    Main {
    public static ArrayList<Integer> solution(int n, int[] A, int m, int[] B) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(p1<n && p2<m) {
            if (A[p1] < B[p2]) {
                list.add(A[p1++]);
            } else {
                list.add(B[p2++]);
            }
        }
        while(p1<n) list.add(A[p1++]);
        while(p2<m) list.add(B[p2++]);
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