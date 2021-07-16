package 백준.문자열.다이얼_5622;
/*
* url:https://www.acmicpc.net/problem/5622
* 문제: 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하세요
* 입력: 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 2<= 단어의길이 <=15
* 출력: 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간(초)를 출력한다.
* 알고리즘
* 1.각 알파벳마다 걸리는 시간을 맵핑시킨다. 약간의 불규칙은 switch 문을 이용하자
* 2.입력으로 들어온 문자열을 하나씩 접근하면서 최소 시간을 더 해준다.
* */

import java.util.Scanner;

public class 다이얼_5622 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int count=0;

        //알고리즘: 세 문자씩 그룹된 것도 있고 네 문자씩 그룹되는 불규칙적 패턴을 보인다. 그럴땐 swtich문을 이용하자.
        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'A': case 'B': case 'C':
                    count +=3;
                    break;
                case 'D': case 'E': case 'F':
                    count +=4;
                    break;
                case 'G': case 'H': case 'I':
                    count +=5;
                    break;
                case 'J': case 'K': case 'L':
                    count +=6;
                    break;
                case 'M': case 'N': case 'O':
                    count +=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count +=8;
                    break;
                case 'T': case 'U': case 'V':
                    count +=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count +=10;
                    break;
            }
        }

        //출력
        System.out.println(count);
    }
}
