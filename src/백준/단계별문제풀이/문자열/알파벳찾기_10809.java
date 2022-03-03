package 백준.단계별문제풀이.문자열;


import java.util.Scanner;

/*
*
* 문제: 알파벳 소문자로 이루어진 문자열 S(길이: 1가 주어진다. 각각의 알파벳에 대해서 문자열 S에 포함되있는 경우 처음 등장하는 위치를,
* 포함하지 않는다면 -1을 출력하는 프로그램을 작성하세요.
* 알고리즘
* 1. 문자열 S를 입력받고 String으로 저장합니다.
* 2. 첫 알파벳이 등장한 인덱스의 값을 저장할 int[26] 배열을 선언합니다.
* 3. 문자열의 길이만큼 반복합니다.
* 4. 반복하면서 charAt()를 이용하여 한 문자씩 접근하여 해당 알파벳의 아스키코드값을 인덱스로 가지는 배열의 값이 -1이 이면
* 해당 아스키 코드 값을 인덱스로하는 배열원소에 문자열의 순서를 넣습니다.
* 5.만약 배열의 값이 -이 아니라면 통과합니다.
* 6. 알파벳 배열을 공백으로 구분하여 출력합니다.
* */
public class 알파벳찾기_10809 {
    public static void main(String[] args) {
        // 1.
        Scanner in = new Scanner(System.in);
        String S = in.next();

        //2.
        int[] position = new int[26];
        for(int i=0; i<26; i++) position[i] = -1;

        // 3.
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(position[ch-'a'] == -1)  // 4.
                position[ch-'a'] = i;
        }

        //6.
        for(int val: position)
            System.out.print(val + " ");
    }
}
