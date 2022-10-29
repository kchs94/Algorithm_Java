package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
* 문제 13023
* ArrayList<Integer>[] list;
* boolean[] check;
* boolean arrival
*
* 사람 수 N 입력, 친구 관계 수 M 입력
*
* check 초기화
* list 초기화
*
* for M만큼
*   연결관계 셋팅
*
* for N만큼
*   check[i]
*   dfs(i)
*   만약 도착했다면
*       break;
*
* 만약 도착한 적이 있다면
*   return 1
* else
*   return 0
*
*  public static void dfs(int i, int depth) {
*       if 깊이 == 5
*           arrival = true
*           break;
*       else
*           for i : list[i]
*               if ( check[i] == false)
*                   check[i] = true;
*                   dfs(i, depth + 1)
*                   check[i] = false;
* --> 시간초과
* */
public class 친구관계파악하기 {
    static ArrayList<Integer>[] list;
    static boolean[] check;
    static boolean arrival = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        list = new ArrayList[N];
        for (int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
        }
        check = new boolean[N];

        int M = Integer.parseInt(st.nextToken());
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            list[n1].add(n2);
            list[n2].add(n1);
        }

        for (int i=0; i<N; i++) {
            check[i] = true;
            dfs(i,1);
            check[i] = false;
        }

        if (arrival == true)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void dfs(int i, int depth) {
        if(depth == 5 | arrival) {
           arrival = true;
        } else {
            for (Integer next : list[i]) {
                if (check[next] == false) {
                    check[next] = true;
                    dfs(next, depth+1);
                    check[next] = false;
                }
            }
        }
    }
}
