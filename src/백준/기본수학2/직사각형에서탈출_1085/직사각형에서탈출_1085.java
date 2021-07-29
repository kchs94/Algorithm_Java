package 백준.기본수학2.직사각형에서탈출_1085;

import java.util.Scanner;

/*
* 입력: 첫째 줄에 x, y, w, h가 주어진다.
* 출력: 최솟값을 출력한다.
* 문제: 한수 위치(x,y)에서 직사각형의 경계선까지 가는 거리의 최솟값을 구하시오.
*
* */
public class 직사각형에서탈출_1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y= in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        in.close();

        int minLength = x;  // 최소길이를 x로 지정

        if(y < minLength)
            minLength = y;
        if(w-x < minLength)
            minLength = w-x;
        if(h-y < minLength)
            minLength = h-y;

        System.out.println(minLength);
    }
}
