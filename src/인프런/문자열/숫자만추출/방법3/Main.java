package 인프런.문자열.숫자만추출.방법3;
/*
* Character.isDigit()이용하기
* */
import java.util.Scanner;

public class Main {
    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {

            if(Character.isDigit(ch))
                sb.append(ch);

        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
