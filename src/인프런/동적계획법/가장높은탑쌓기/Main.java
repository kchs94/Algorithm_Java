package 인프런.동적계획법.가장높은탑쌓기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
* 가장 높이 쌓을 수 있는 탑의 높이를 출력한다.
*
* 가장 높이 쌓으려면?
* 가능한 많은 벽돌을 사용
* 가능한 높이가 큰 벽돌을 사용
*
* 고민인건 이 문제를 보고 동적 계획법으로 풀어야 겠다는 생각이 어떻게하면 들가는 점이다.
*
* 풀이
* 벽돌 객체를 만들어 정렬을 해야한다.
* 왜 배열은 안될까? 배열은 정렬을 하게 되면
*
*
* */

class Brick implements Comparable<Brick>{
    public int s, h, w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Main {

    static int[] dp;

    public int solution(int N, ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);  // 넓이를 기준으로 내림차순 정렬
        dp[0] = arr.get(0).h;   // 초기화, 0번째 벽돌이 제일 위에 있을 때 최대 높이
        answer = dp[0]; // 0이아닌 dp[0]으로 초기화 왜?? 탑이
        for (int i=1; i<N; i++) {
            int max_h=0;
            for (int j=i-1; j>=0; j--) {
                if (arr.get(j).w > arr.get(i).w && dp[j] > max_h) {
                    max_h = dp[j];
                }
            }
            dp[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dp =new int[N];

        for (int i=0; i<N; i++) {
            int s = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();
            arr.add(new Brick(s, h, w));
        }

        System.out.println(T.solution(N, arr));
    }
}
