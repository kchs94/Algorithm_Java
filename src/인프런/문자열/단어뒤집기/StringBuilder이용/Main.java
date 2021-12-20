package 인프런.문자열.단어뒤집기.StringBuilder이용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String solution(String[] strings) {

        /*for(int i=0; i<strings.length; i++) {
            System.out.println(strings[i]);
        }*/

        StringBuilder result = new StringBuilder();
        StringBuilder sb;
        for(String s : strings) {   // 단어 갯수만큼 반복

            sb = new StringBuilder(s);
            sb.reverse();
            result.append(sb.toString()).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력

        int N = Integer.parseInt(br.readLine());    // N 입력

        String[] strings = new String[N];   // 길이가 N인 문자열 생성
        for(int i=0; i<N; i++) {    // 단어 입력
            strings[i] = br.readLine();
        }

        Main T = new Main();

        System.out.println(T.solution(strings));
    }
}
