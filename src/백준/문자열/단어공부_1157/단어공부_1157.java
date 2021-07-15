package 백준.문자열.단어공부_1157;
/*
* url:https://www.acmicpc.net/problem/1157
* 문제: 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하세요.
* 단 대소문자는 구분하지 않습니다.
* 입력: 첫째 줄에 알파벳 대소문자로 이루어진 단어가 입력됩니다. 입력되는 단어의 길이는 1,000,000을 넘지 않습니다.
* 출력: 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력합니다. 단, 가장 많이 사용된 알파벳이 여러 개 존재할 경우 ?를 출력합니다.
* */


import java.util.Scanner;

public class 단어공부_1157 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        String arr = in.next().toUpperCase();   // 문자열 --> String[]로 한 문자씩 저장 한문자씩 접근할예정
        int[] alpha = new int['z'-'a'+1];   // 알파벳 갯수

        // 알고리즘
        for(int i=0; i<arr.length(); i++){
            alpha[arr.charAt(i) - 'A']++; // 인덱스 0:A
        }
        int max = -1;   // 최댓값
        char ch = '?';  // 출력할 문자

        for(int i=0; i<26; i++){    // 모든 배열 원소에 접근하는데 원소 값이 크면 max로 바꿔주고
            if(alpha[i]> max){
                max = alpha[i];      // ch에 해당 인덱스에 대응하는 문자를 넣어준다
                ch = (char) (i+65);  // 대문자로 출력
            }
            else if(alpha[i] == max){   // 최대 갯수가 같은게 존재한다는 의미
                ch = '?';
            }
        }
        System.out.println(ch);

    }
}
