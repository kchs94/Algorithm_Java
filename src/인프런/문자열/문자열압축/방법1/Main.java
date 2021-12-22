package 인프런.문자열.문자열압축.방법1;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1; i<chars.length; i++) {

            if(chars[i] == chars[i-1]) {    // 왼쪽 문자랑 현재 문자가 같으면
                count++;
            }
            else {  // 왼쪽 문자와 다르면
                sb.append(chars[i-1]);

                if(count != 1)
                    sb.append(count);
                count = 1;
            }
        }

        sb.append(chars[chars.length-1]);

        if(count != 1)
            sb.append(count);


        System.out.println(sb);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
