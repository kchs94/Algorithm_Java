package 인프런.문자열.숫자만추출.방법1;
/*
* 문자열에서 숫자만 추출해서 출력한다.
* 만약 앞에 0이 있으면 사라지게한다.
*
* */
import java.util.Scanner;

public class Main {

    public int solution(String str) {
        StringBuilder sb = new StringBuilder(); // 숫자를 붙이기 위해

        for(char ch : str.toCharArray()) {

            if('0' <= ch && ch <= '9')  // 숫자 문자면 붙여준다.
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
