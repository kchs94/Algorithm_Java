package 백준.for문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 기찍N_2742 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 자연수 N이 주어질 때
        br.close();

        for(int i=0; i<N; i++)      // N부터 1까지 한 줄에 하나씩 출력
            System.out.println(N-i);

    }
}
