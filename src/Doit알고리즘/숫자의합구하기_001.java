package Doit알고리즘;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/11720
* 1.문제분석
* - 데이터 크기:100
* - 제한시간: 1초
* - 여유롭다. 그래서 Scanner을 사용하기로 결정
* - 굳이 N을 이용할 필요가 없다. 그리고 값을 저장할 필요도 없다. 바로바로 sum에 담는다.
* - 반례 간단히 생각: 1
* 2.수도코드
* - N을 입력받는다.
* - int sum = 0
* - 두 번째 줄의 값을 문자열로 입력받은 다음에 바로 문자 배열로 변환하고 향상된 for문을 사용한다.
* - 형 변환을 해서 sum에 더해준다.
* - sum을 출력한다.
* */
public class 숫자의합구하기_001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int sum = 0;
        for (char ch : in.next().toCharArray()) {
            sum += Character.getNumericValue(ch);   // ch - '0'도 가능
        }

        System.out.println(sum);
    }
}
