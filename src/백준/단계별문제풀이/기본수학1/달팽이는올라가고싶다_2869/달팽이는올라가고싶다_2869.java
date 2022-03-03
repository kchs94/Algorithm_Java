package 백준.단계별문제풀이.기본수학1.달팽이는올라가고싶다_2869;

import java.util.Scanner;

/*
* 입력: 세 자연수 A, B, V가 공백으로 주어진다.(1<=B<=A<=V<=1,000,000,000)
* 출력: 달팽이가 나무 막대 정상까지 도달하는 데 며칠이 걸리는지 출력.
* V: 나무 높이(미터), A: 낮에 올라갈 수 있는 높이(미터), B: 밤에 미끌어지는 미터
* 올라가는 높이, 미끄러지는 높이, 나무 높이
* 첫 날 (2, 1) (3, 2) (4, 3) (5) 4일
* // 시간초과
* */
public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upOneDay = in.nextInt();    // 하루 올라갈 수 있는 높이
        int downOneDay = in.nextInt();  // 하루 미끄러지는 높이
        int treeHeight = in.nextInt();  // 나무 높이
        in.close();

        int day = (treeHeight - downOneDay) / (upOneDay - downOneDay);
        if((treeHeight - downOneDay) % (upOneDay - downOneDay) !=0)
            day++;

        System.out.println(day);
    }
}
