package 백준.단계별문제풀이.재귀.팩토리얼_10872;

import java.util.Scanner;

// 재귀함수가 아닌 반복문으로 풀기
public class 팩토리얼_10872_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int answer=1;

        // 알고리즘
        while(N !=0) {
            answer = answer * N;
            N--;
        }

        //출력
        System.out.println(answer);
    }
}
