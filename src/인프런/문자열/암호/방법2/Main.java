package 인프런.문자열.암호.방법2;

import java.util.Scanner;
/*
* replace는 문자로 대체
* replaceAll는 정규식으로 대체
*
* */
public class Main {

    public String solution(int n, String str) {
            String answer ="";
        for(int i=0; i<n; i++) {
            String temp = str.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();

        Main T = new Main();
        System.out.println(T.solution(num, str));
    }
}
