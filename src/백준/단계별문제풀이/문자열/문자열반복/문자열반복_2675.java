package 백준.단계별문제풀이.문자열.문자열반복;

import java.util.Scanner;

/*
* url:https://www.acmicpc.net/problem/2675
*
* */
public class 문자열반복_2675 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // 테스트 케이스 갯수


        // 알고리즘
        for(int i=0; i<T; i++){ // 테스트 케이스만큼 반복
            int repeat = in.nextInt();  // 문자 반복 횟수
            String str = in.next();     // 입력 문자열
            StringBuffer sb = new StringBuffer();   // 이어붙일 문자열

            for(int j=0; j<str.length(); j++){  // 문자열 길이만큼 반복
                for(int k=0; k<repeat; k++){    // 문자 반복 횟수만큼 반복
                    sb.append(str.charAt(j));   // 이어붙이기
                }
            }
            
            // 출력
            System.out.println(sb.toString());  

        }
    }
}
