package 인프런.문자열.대소문자변환.내장함수이용;

import java.util.Scanner;

/*
* 대소문자 변환 문제
* 한 문자열을 입력받고 소문자는 대문자로 바꾸고 대문자는 소문자로 바꾸는 문제
* 우선 문자열의 길이만큼 반복해서 한 문자씩 처리할건데. 문자열이 아닌 문자 단위로 처리하므로 향상된 for문과 toCharArray()로 접근한다.
* 특정 문자가 소문자인걸 알려면 그 문자의 아스키 코드값을 알면된다. 그리고 아스키코드에서 소문자가 대문자보다 값이 작다.
* 특정 알파벳의 대문자 소문자 값차이는 32이다.
* 대문자에서 소문자로 만드려면 값을 -32해준다. 소문자에서 대문자를 만드려면 값을 32더해준다.
* 그리고 구한 문자들을 이어붙이기 위해 StringBuilder를 사용한다.
* */
public class Main {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch))   // 소문자면 참
                sb.append(Character.toUpperCase(ch));
            else if(Character.isUpperCase(ch))  // 대문자면 참
                sb.append(Character.toLowerCase(ch));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
