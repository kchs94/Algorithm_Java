package 인프런.문자열.특정문자뒤집기.방법1;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();   // 문자열 --> 문자배열, 문자열은 값을 변경할 수 없으므로
        int leftIndex = 0;
        int rightIndex = chars.length-1;

        while(leftIndex < rightIndex) { // 인덱스가 역전되기 전까지

            if(!Character.isAlphabetic(chars[leftIndex])) { // 알파벳이 아니면
                leftIndex++;
            }
            else if(!Character.isAlphabetic(chars[rightIndex])) {   // Character.isAlphabetic()
                rightIndex--;
            }
            else {
                char temp = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }

        }
        answer = String.valueOf(chars); // 문자 배열--> 문자열

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
