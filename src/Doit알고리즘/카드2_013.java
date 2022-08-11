package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
* https://www.acmicpc.net/problem/2164
* - 분석
* - 큐를 카드가 들어가고 나가는 모습이 큐와 가장 잘 어울려서 큐를 이용해서 문제를 풀었다.
*
*
* */
public class 카드2_013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            q.offer(i);
        }

        while(q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
