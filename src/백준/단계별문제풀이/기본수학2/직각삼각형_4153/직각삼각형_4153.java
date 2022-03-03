package 백준.단계별문제풀이.기본수학2.직각삼각형_4153;

import java.util.Scanner;

/*
* 문제: 직각 삼각형인지 판단하시오
* 입력: 여러개의 테스트케이스 마지막 줄에 0 0 0 입력되면 종료. a b c (1<= a,b,c, <= 30,000)
* 출력: 직각 삼각형이 맞으면 "right" 아니면 "wrong"
* 1. 세 변수를 입력받습니다.
* 2. 세 변수 모두 값이 0이면 루프를 탈출하고 프로그램을 종료합니다.
* 3. 가장 큰 수를 찾습니다.
* 4-1. 가장 큰수 ^2 = 나머지1^2 + 나머지^2 조건이 참이면 right 출력합니다.
* 4-2. 가장 큰수 ^2 = 나머지1^2 + 나머지^2 조건이 거짓이면 false 출력합니다.
* 5. 1로 돌아갑니다.
*
* */
public class 직각삼각형_4153 {
    public static void main(String[] args) {
        //1.
        Scanner in = new Scanner(System.in);
        int x,y,z;

        while(true){
            x=in.nextInt();
            y=in.nextInt();
            z=in.nextInt();

            if(x==0 && y==0 && z==0) break;

            if((x * x + y * y) == z * z) {
                System.out.println("right");
            }
            else if(x * x == (y * y + z * z)) {
                System.out.println("right");
            }
            else if(y * y == (z * z + x * x)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
