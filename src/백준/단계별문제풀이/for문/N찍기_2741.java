package 백준.단계별문제풀이.for문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N찍기_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 자연수 N이 주어졌을 때
        br.close();

        for(int i=1; i<=N; i++)         // 1부터 N까지 한 줄에 하나씩 출력
            System.out.println(i);
    }
}
