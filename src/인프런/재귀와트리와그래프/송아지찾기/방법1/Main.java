package 인프런.재귀와트리와그래프.송아지찾기.방법1;

import java.util.Scanner;

public class Main {

    int solution(int s, int e) {
        int answer = 0;

        if (s < e) {
            int len = e - s;
            int mock = len / 5;
            if (len % 5 <= 2)
                answer = mock + len%5;
            else if (len% 5 >= 3)
                answer = mock + 1 + Math.abs(5- len%5);
        } else {
            answer = s - e;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int E = in.nextInt();
        System.out.println(T.solution(S, E));
    }
}
