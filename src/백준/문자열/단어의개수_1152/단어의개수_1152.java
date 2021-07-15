package 백준.문자열.단어의개수_1152;

import java.util.Scanner;
/*
* url: https://www.acmicpc.net/problem/1152
* 문제: 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 입력된다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 짜보자
* 단, 한 단어가 여러 번 등장하면 횟수만큼 모두 세어야 한다.
* 입력: 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 입력됩니다. 이 문자열의 길이는 1,000,000을 넘지 않습니다.
* 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없습니다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있습니다.
* 출력: 첫째 줄에 단어의 개수를 출력합니다.
* */
public class 단어의개수_1152 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim();

        // 알고리즘
        if(str.isEmpty() == false){
            int cnt=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == ' ')
                    cnt++;
            }
            System.out.println(cnt+1);
        }
        else    // 문자열이 공백으로 이루어진 경우 trim()은 빈 문자열을 반환한다.
            System.out.println(0);
    }
}
