package 백준.단계별문제풀이.기본수학1.FlymetotheAlphaCentauri_1011;
/*
* 문제: x지점부터 y지점까지 이동하는데 장치 작동 횟수의 최솟값을 구해라
* 입력: 테스트케이스, x지점, y지점
* 조건: k(n) = k(n-1)-1 or k(n-1) or k(n-1) + 1, 도착 직전 이동거리는 1. 처음작동시 1이동. (0<=x < y <2^31)
* 출력: 작동 횟수 최솟값 count
* 알고리즘
* 1. 테스트케이스 T를 입력받고 T만큼 반복한다.
* 2. 입력 x, y를 받고 길이 leng(y-x)를 계산한다.
* 3.
*
* */
import java.util.Scanner;

public class FlymetotheAlphaCentauri_1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();	// 테스트 케이스

        for(int i = 0; i < T; i++) {

            int X = in.nextInt();
            int Y = in.nextInt();

            int distance = Y - X;	// 거리

            int max = (int)Math.sqrt(distance);	// 소수점 버림

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            }
            else if(distance <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }

        }
    }
}
