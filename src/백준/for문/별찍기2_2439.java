package 백준.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기2_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i=1; i<=N; i++){        // 총 N번 반복
            for(int j=1; j<=N-i; j++)   // 총 N-i번 반복
                System.out.print(" ");
            for(int k=1; k<=i; k++)     // 총 i번 반복
                System.out.print("*");
            System.out.println();
        }
    }
}
