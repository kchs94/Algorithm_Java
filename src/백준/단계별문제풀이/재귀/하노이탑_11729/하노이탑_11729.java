package 백준.단계별문제풀이.재귀.하노이탑_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑_11729 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = (int)Math.pow(2, num) - 1;

        sb.append(count).append("\n");
        movePlate(num,1,2,3);
        System.out.println(sb);
    }

    public static void movePlate(int num, int from, int other, int to) {

        if(num == 0)
            return;

        movePlate(num-1, from, to, other);
        sb.append(from).append(" ").append(to).append("\n");
        movePlate(num-1,other, from, to);
    }
}