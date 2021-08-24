package 코드업.문자열;

import java.util.Scanner;

public class 문제_1408 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String password = in.next();    // 비밀번호 입력

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<password.length(); i++){ // 암호화1
            sb.append((char)(password.charAt(i) + 2));
        }

        sb.append("\n");

        for(int i=0; i<password.length(); i++){ // 암호화2
            sb.append((char)((password.charAt(i)*7) % 80 + 48));
        }

        System.out.println(sb);
    }
}
