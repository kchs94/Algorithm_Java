package 인프런.재귀와트리와그래프.송아지찾기.방법2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
* BFS 상태트리 탐색
* 최단거리를 구하는 알고리즘이다.
* */
public class Main {

    int[] dis = {1, -1, 5};
    int[] check; // 값이 같은 노드를 다시 방문하지 않기 위해
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        check = new int[10001]; // 값이 1~10000이니깐
        check[s] = 1;
        Q.offer(s); // 노드 만들기
        int Level = 0;  // 루트 노드의 레벨 초기화
        while (!Q.isEmpty()) {
            int len = Q.size(); // 레벨에 있는 원소의 갯수
            for (int i=0; i<len; i++) { // 레벨 탐색
                int x= Q.poll();    // 꺼내기
                for (int j : dis) { // 자식 노드 찾기
                    int nextX = x + j; // 다음 노드 값 설정
                    if (nextX == e) // 집어 넣을 때 찾기
                        return Level + 1;   // 찾으면 함수호출을 종료한다.
                    if (nextX >=1 && nextX <=10000 && check[nextX] == 0) {  // 유효한 범위에서 방문을 안했으면
                        check[nextX] = 1 ;  // 방문 표시하고
                        Q.offer(nextX);
                    }
                }
            }
            Level++;    // 레벨 탐색이 끝났으면 레벨 증가
        }
        return 0;   // 컴파일 에러 방지위해
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
