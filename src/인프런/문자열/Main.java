package 인프런.문자열;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public int solution(String str, char c) {

        int num=0;
        int length = str.length();
        str = str.toLowerCase();

        for(int i=0; i<length; i++) {

            if(str.charAt(i) == c)
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().toLowerCase().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
