package 인프런.문자열.중복문자제거.IndexOf활용;
// indexOf의 특성을 이용한다. indexOf(문자)는 문자열에서 해당 문자인 첫번째 인덱스를 반환한다.
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i)
                sb.append(str.charAt(i));
        }

        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
