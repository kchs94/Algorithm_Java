package 백준.기본수학1.달팽이는올라가고싶다_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 시간초과하지 않기위해 입력을 Scanner로 받지 않습니다.
* */
public class 달팽이는올라가고싶다_2869_2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int day=0;

        if((length - down) % (up - down) ==0)
            day = (length - down) / (up - down);
        else{
            day = (length - down) / (up - down);
            day++;
        }

        System.out.println(day);
    }
}
