package 인프런.문자열.암호.방법1;

import java.util.Scanner;

public class Main {

    public String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '#')
                sb.append(1);
            else if(ch == '*')
                sb.append(0);
        }
        String temp = sb.toString();
        sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            String binary = temp.substring(7*i, 7*(i+1));
            int decimal = Integer.parseInt(binary, 2);
            sb.append((char)decimal);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();

        Main T = new Main();
        System.out.println(T.solution(num, str));
    }
}
