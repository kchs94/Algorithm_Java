package 백준.문자열.크로아티아알파벳_2941;

import java.util.Scanner;

/*
* url: https://www.acmicpc.net/problem/2941
* 문제: 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져있는지 출력한다.
* 크로아티아 알파벳 'lj'와 같은 것은 한 문자로 본다. 위 목록에 없는 알파벳은 한 글자씩 센다.
* 입력: 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-','='로만 이루어져있다.
* 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
* 출력: 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* 주의할점
* 1.배열로 풀 때 참조하려는 인덱스가 범위에 벗어나지 않도록 유의해야 한다.
* 알고리즘
* 1.
* */
public class 크로아티아알파벳_2941 {
    public static void main(String[] args) {

        //입력
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int count=0;

        //알고리즘

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == 'c') {			// 만약 ch 가 c 라면?
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {		//만약 ch 다음 문자가 '=' 이라면?
                        // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                        i++;
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(ch == 'd') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2) {
                            if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                                i += 2;
                            }
                        }
                    }

                    else if(str.charAt(i + 1) == '-') {	// d- 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// lj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// nj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// s= 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// z= 일 경우
                        i++;
                    }
                }
            }

            count++;

        }

        System.out.println(count);
    }
}
