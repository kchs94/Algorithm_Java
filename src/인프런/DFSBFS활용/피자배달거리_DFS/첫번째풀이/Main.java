package 인프런.DFSBFS활용.피자배달거리_DFS.첫번째풀이;
/*
*
* - 각 집마다 '피자배달거리'가 있다.
* - 피자배달거리: 여러 피자집 중에서 가장 가까운 피자집과의 거리
* - 살리고자하는 피자집 M개를 선택하는 기준: 도시피자배달거리가 최소가 되는 M개
* - 도시피자 배달거리 = 각 집들의 피자 배달거리 합
* - 그러므로 전체 피자집 중에서 M개를 선택하는 모든 경우를 구한 다음에 각 경우의 수마다 도시피자배달거리를 구한후
* - 최솟값을 구한다.
* */

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int N;
    static int M;
    static int len;
    static int[] combination;
    static ArrayList<Point> house = new ArrayList<>();
    static ArrayList<Point> pizza = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int L, int startNum) {
        if (L == M) {

            int sum = 0;
            for (Point house : house) {
                int distance = Integer.MAX_VALUE;
                for (int i : combination) {
                    distance = Math.min(distance, Math.abs(house.x - pizza.get(i).x) +
                            Math.abs(house.y - pizza.get(i).y));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i=startNum; i<len; i++) {
                combination[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        combination = new int[M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int temp = in.nextInt();
                if (temp == 1) {
                    house.add(new Point(i,j));
                }
                else if(temp == 2) {
                    pizza.add(new Point(i,j));
                }
            }
        }
        len = pizza.size();
        DFS(0,0);

        System.out.println(answer);
    }
}
