package 인프런.문자열.숫자만추출.방법2;
/*
* 숫자로 접근하기
* */
import java.util.Scanner;

public class Main {
    public int solution(String str) {
        int answer = 0;
        for(char ch : str.toCharArray()) {

            if('0' <= ch && ch <= '9')  // 숫자 문자면 붙여준다. 
               answer = 10 * answer + (ch - '0');   // 숫자문자 - '0' = 진짜 숫자
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
