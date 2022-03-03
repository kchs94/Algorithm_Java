package 백준.단계별문제풀이.기본수학2.택시기하학_3053;

import java.util.Scanner;

/*
* 문제: 반지름 R을 입력받으면, 유클리드 기하학에서의 원의 넓이와 택시 기하학에서 원의 넓이를 구하세요.
* 입력: 반지름 R(1<= R<=10,000)
* 출력: 첫째 줄: 유클리드 기하학에서 원의 넓이. 둘째 줄: 택시 기하학에서 원의 넓이.
* 조건: 유클리트 기하학에서 원 넓이: 파이*r^2, 택시 기하학(맨해튼거리)에서 원 넓이: 2r^2
* 알고리즘:
*
* */
public class 택시기하학_3053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();

        System.out.println(Math.PI*r*r);
        System.out.println((double)2*r*r);
    }
}
