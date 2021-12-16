package 인프런.문자열;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public int solution(String str, char c) {

        int num=0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        // 향상된 for문으로 바꿔보기 문자열 못온다. 배열과 List 등만 가능
        for(char x : str.toCharArray()) {   // 문자열 --> 문자 배열로 바꾸기
            if (x == c)
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next(); // 문자열 하나 읽기
        char c = in.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
