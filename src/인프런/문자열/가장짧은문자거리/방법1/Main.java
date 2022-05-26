package 인프런.문자열.가장짧은문자거리.방법1;
/*
* 왼쪽 --> 오른쪽으로 반복해서 왼쪽으로부터 특정문자와의 거리 구하기
* 오른쪽 --> 왼쪽으로 반복해서 거리 구하기
* 그리고 결과로 나온 2값 중 작은 값을 저장하기
* */
import java.util.Scanner;

public class Main {
    public int[] solution(String str, char ch) {
        char[] chars = str.toCharArray();
        int[] result = new int[chars.length];
        int length = chars.length;
        int distance = str.length();
        // 왼쪽 --> 오른쪽
        for(int i=0; i<length; i++) {

            if(chars[i] == ch) {    // 찾는 문자면 1.0 할당하고 2.거리 초기화
                distance = 0;   //초기화
            }
            else {  // 다른 문자면 1.1증가하고 2.값 할당
                distance++;
                result[i] = distance;
            }
        }

        // 오른쪽 --> 왼쪽
        distance = str.length();    // 문자열 길이로 초기화
        for(int i=length-1; 0<=i ; i--) {

            if(chars[i] == ch) {    // 찾는 문자면 1.0 할당하고 2.거리 초기화
                result[i] = 0;
                distance = 0;   //초기화
            }
            else {  // 다른 문자면 1.1증가하고 2.값 할당
                distance++;
                result[i] = Math.min(distance, result[i]);
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch = in.next().charAt(0);  // 문자열 --> 문자
        Main T = new Main();
        for (int integer : T.solution(str, ch)) {
            System.out.print(integer + " ");
        }
    }
}
