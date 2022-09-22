package 프로그래머스.레벨2.구명보트;

import java.util.Arrays;
/*
* [50-i, 50, 70, 80-j] limit 100 return 3
* 구명보트 최솟값 --> 가장 무거운 사람과 가장 가벼운 사람을 태워야 가성비 있게 구출 가능
* 50 + 80 = 130 > 100 어쩔 수 없이 무거운 사람만 구출함
* [50-i,50,70-j,80]
* 50 + 70 = 120 > 100 어쩔 수 없이 무거운 사람만 구출함
* [50-i, 50-j,70, 80]
* 50 + 50 = 100 = 100 가장 가벼운 사람과 가장 무거운 사람 둘 다 탈출
*
* [50-i, 70, 80-j] limit 100
* 50 + 80 = 130 > 100
* [50-i, 70-j]
* 50 + 70 = 120 > 100
* [50-i,j]
* 
* */
public class Solution {
    public int solution(int[] people, int limit) {
        int numOfBoat = 0;

        Arrays.sort(people);

        // 무거운 사람부터 선택
        int i=0;
        for (int j = people.length-1; i<=j; j--) {

            // 가장 가벼운 사람 + 가장 무거운 사람 > 보트 수용 무게
            if (people[i] + people[j] > limit)
                numOfBoat++;    // 무거운 사람만 보트에 보내기
            else {
                i++;
                numOfBoat++;    // 가벼운 사람 + 무거운 사람 둘다 태우고 보트 보내기
            }
        }
        return numOfBoat;
    }
}
