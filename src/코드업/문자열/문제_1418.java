package 코드업.문자열;

import java.util.Scanner;

public class 문제_1418 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 't') sb.append(i+1 + " ");
        }
        System.out.println(sb);
    }
}
