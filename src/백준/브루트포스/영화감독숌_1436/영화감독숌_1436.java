package 백준.브루트포스.영화감독숌_1436;

import java.util.Scanner;

/*
*
* 문제:숌이 만든 N번째 영화 제목에 들어갈 숫자를 출력하는 프로그램을 작성하세요.
* 조건: 1.종말의 숫자(어떤 수에 6이 최소 3개이상 연속으로 들어가는 숫자)가 들어간다. 예, 666, 1666, 2666, 3666, ...
* 조건: 2. 작은 종말의 숫자부터 영화 제목이 만들어 진다.
* 입력: N(1<= N <= 10,000)
* 출력: N번째 영화 제목에 들어갈 종말의 숫자
* 알고리즘: 브루트포스(완전탐색)
* 1. N을 입력받습니다.
* 2. 몇 번째 종말의 숫자인지 카운트할 count 변수를 선언합니다.
* 3. 666부터 시작해 값을 1씩 증가 시킨다.
* 4. 해당 문자열에 '666'이 있을 경우 count를 1증가한다.
* 5. N과 count가 같아지면 해당 숫자를 출력한다.
* 포인트: 숫자를 증가시킬 때는 int형으로, 666이 포함되어 있는지 검사할 때는 문자열로 검사한다.
* 문자열 검사 방법은 charAt()과 contains() 두 메소드가 있다. charAt()은 문자열에 특정 한 문자가 있는지 검사하는 메소드이다.
* // contains()는 문자열에 특정 문자열이 포함되어있는지 검사하는 메소드이다.
* */
public class 영화감독숌_1436 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        int count=1;
        int value=666;

        while(count !=N){

            value++;

            if(Integer.toString(value).contains("666")){    // String.valueOf(value).contains("666")도가능
                count++;
            }
        }

        System.out.println(value);
    }
}
