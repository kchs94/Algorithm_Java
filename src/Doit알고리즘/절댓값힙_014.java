package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

/*
* https://www.acmicpc.net/problem/11286
* 1.분석
*
* 2.수도코드
*
*
* */
public class 절댓값힙_014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>((o1, o2) -> {
           int first = Math.abs(o1);
           int second = Math.abs(o2);

           if (first == second)
               return o1.compareTo(o2);

           return (first - second);
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (q.size() == 0) {
                    sb.append("0\n");
                }
                else{
                    sb.append(q.poll() + "\n");
                }
            }
            else {
                q.offer(input);
            }
        }

        System.out.println(sb);
    }
}
