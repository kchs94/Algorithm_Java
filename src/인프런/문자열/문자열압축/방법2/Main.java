package 인프런.문자열.문자열압축.방법2;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        str = str + " ";    // 예외를 제거하기위한 공백문자 추가
        int count = 1;
        for(int i=0; i< str.length()-1; i++) {  // 빈 문자 전까지
            if(str.charAt(i) == str.charAt(i+1))
                count ++;
            else {
                answer += str.charAt(i);
                if(count > 1)
                    answer += String.valueOf(count);
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
