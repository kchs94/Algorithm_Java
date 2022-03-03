package 인프런.재귀와트리와그래프.부분집합구하기2;

import java.util.Scanner;

/*
* 부분집합 구하기
* 원소를 포함하냐 포함하지 않느냐 2가지의 가지가 생긴다. DFS
*
* */
public class Main {

    static boolean[] check; // 값의 사용 여부를 기록하는 배열
    static int n;   // 마지막 숫자

    public static void DFS(int value) {
        if (value == n+1) { // 마지막 숫자보다 1크면 재귀를 그만합니다. 그리고 지금까지의 결과가 담긴 체크배열을 출력합니다.
            String temp = "";

            for (int i=1; i<=n; i++) {
                if (check[i]) {
                    temp += i + " ";
                }
            }
            if (temp.length() > 0)
                System.out.println(temp);
        }
        else {
            check[value] = true;    // 값이 있을 때
            DFS(value + 1); // 왼쪽
            check[value] = false;   // 값이 없을 때
            DFS(value + 1); // 오른쪽
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();   // 1~n
        check = new boolean[n+1];   // 인덱스는 값을 의미합니다.
        DFS(1); // 첫 번째 원소부터 시작
    }
}
