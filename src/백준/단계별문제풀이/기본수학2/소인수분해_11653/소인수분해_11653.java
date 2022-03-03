package 백준.단계별문제풀이.기본수학2.소인수분해_11653;

import java.util.Scanner;

/*
* 문제: 정수 N이 주어졌을 때, 소인수분해를 하는 프로그램을 작성하세요.
* 입력: N(1<= N <= 10,000,000)
* 출력: N의 소인수분해 결과를 하나씩 오름차순으로 출력합니다. N이 1인 경우  아무것도 출력하지 않습니다.
* 소인수분해: 1보다 큰 자연수를 소인수(소수인 인수)들만의 곱으로 나타내는 것. 어떤 수를 소수로 구성된 수로 인수분해 할것.
* 알고리즘:
* */
public class 소인수분해_11653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int i=2;
        while(true){
            if(N%i == 0){
                System.out.println(i);
                N /= i;
            } else {
                // 나누어 떨어지는 값이 아니면 값 증가
                i++;
            }
            if(N==1) break;
        }

    }
}
