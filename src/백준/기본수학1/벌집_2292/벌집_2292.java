package 백준.기본수학1.벌집_2292;

import java.util.Scanner;

/*
* 문제: 입력으로 숫자 N이 주어졌을 때 벌집 중앙 1번에서 N번 방까지 최소 개수로 갈 때 몇 개의 방을 지나는지(시작과 끝 포함) 출력하시오.
* 입력: 1<= N <10억 : int
* 출력: 지나는 방의 최소 갯수: int
* 알고리즘
* 1. 숫자 N을 int로 입력받는다.
* 테스트 케이스
* 출력값: 1 갯수(1), 2갯수(6개), 3갯수(12개) 4갯수(18) 일반화: 층마다 6개씩 층가한다.
* */
public class 벌집_2292 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int layer=1;
        int num =0; // 현재 층의 방의 갯수
        int totalNum = 1;   // 전체 층 방의 갯수
        in.close();

        // 알고리즘
        while(true){
            if(N <= totalNum)
                break;
            else{
                num +=6;
                totalNum += num;
                layer++;
            }
        }
        // 출력
        System.out.println(layer);

    }
}
