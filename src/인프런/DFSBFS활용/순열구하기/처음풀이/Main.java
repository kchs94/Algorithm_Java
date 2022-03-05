package 인프런.DFSBFS활용.순열구하기.처음풀이;

import javax.swing.text.Style;
import java.util.Scanner;

/*
* 10이하의 N개의 자연수가 주어지면,
* 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
*
* 입력
* 3<=N<=10
* 2<=M<=N
*
* 출력
* 출력 순서는 오름차순으로 합니다.
*
* 순열 = 1.뽑고 2.나열
* DFS로 풀기
*
* */
public class Main {

    static int n;   // n개의 자연수
    static int[] arr;   // n개의 자연수를 담을 배열
    static boolean[] checked;   // 중복 순열이 아니므로
    static int[] pm;    // 순열
    static int m;   // m개를 뽑는다.

    public static void dfs(int L) {
        if (L == m) {
            for (int x : pm){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i=0; i<n; i++) {
                if (!checked[i]) {
                    checked[i] = true;  // 중복되면 안되니깐 체크를 하고
                    pm[L] = arr[i];     // 값을 저장한다
                    dfs(L + 1);
                    checked[i] = false; // 돌아갈 때는 다시 체크를 풀어준다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        checked = new boolean[n];
        m = in.nextInt();
        pm = new int[m];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        dfs(0);
    }
}
