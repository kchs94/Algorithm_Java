package 코드업.문자열;

import java.util.Scanner;

/*
* 글자수가 100이하인 문자열을 입력받으면 공백을 제거해서 출력하는 프로그램
* */
public class 문제_1407{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 문자열 수정 및 추가하니깐.
        String[] str = in.nextLine().split(" ");// 공백 기준으로 문자열 자르기

        for(int i=0; i<str.length; i++){
            sb.append(str[i]);  // 문자열 붙이기
        }
        System.out.println(sb);

    }
}
