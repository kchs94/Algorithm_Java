package 코드업.문자열;

import java.util.Scanner;

/*
* 출제의도: 대문자와 소문자 변환을 할 수 있나요?
*
* */
public class 문제_1295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<word.length(); i++){
            if('a' <= word.charAt(i))    // 대문자이면
                sb.append((char)(word.charAt(i)-32));
            else if('A' <= word.charAt(i))   // 소문자이면
                sb.append((char)(word.charAt(i)+32));
            else    // 숫자이면
                sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }
}
