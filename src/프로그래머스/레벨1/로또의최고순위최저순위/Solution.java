package 프로그래머스.레벨1.로또의최고순위최저순위;

// 구매한 로또 번호와 당첨 번호가 주어질 때, 당첨 가능한 최고 순위와 최저 순위를 구하세요.

// 구매한 로또 번호와 당첨 번호를 정렬합니다.
// 구매한 로또 번호를 당첨 번호와 비교하여 맞춘 갯수를 구합니다.
// FOR int i=0 to 6 do {
//      FOR int j=0 to 6 {
//          IF(로또 번호가 0이면) {
//              0갯수 증가
//              반복 탈출
//          }
//
//          IF(로또 번호 < 당첨 번호)
//              반복 탈출
//          IF(로또 번호 == 당첨 번호){
//              맞춘 개수 증가
//              반복 탈출
//          }
// 맞춘 갯수를 통해 최저순위를 구합니다.
// 최저순위 = 맵핑함수(맞춘 갯수)
// 최저순위와 0번호 갯수를 더해 최고 순위를 구합니다.
// 최고 순위와 최저 순위를 배열로 반환합니다.

// 순위 맞힌갯수와순위맵핑(맞힌갯수)
// Switch(맞힌개수):
//      case 6:
//          순위 = 1;
//      case 5:
//          순위 = 2;
//      case 4:
//          순위 = 3;
//      case 3:
//          순위 = 4;
//      case 2:
//          순위 = 5;
//      case 1,0:
//          순위 = 6;
//
//      return 순위

import java.util.*;

class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int numOfZero = 0;          // 0 갯수
        int numOfWinningNum = 0;    // 맞힌 갯수

        for(int i=0; i<6; i++){

            for(int j=0; j<6; j++){

                if(lottos[i] == 0){
                    numOfZero++;
                    break;
                }

                if(lottos[i] < win_nums[j])
                    break;

                if(lottos[i] == win_nums[j]){
                    numOfWinningNum++;
                    break;
                }
            }
        }

        int badRank = getRank(numOfWinningNum); // 최저 순위
        int goodRank = getRank(numOfWinningNum + numOfZero);    // 최고 순위
        int[] answer = {goodRank, badRank};

        return answer;
    }

    // 맞힌 갯수를 입력하면 순위를 반환하는 함수
    public static int getRank(int numOfWinningNum){
        int rank = 0;
        switch(numOfWinningNum){
            case 6:
                rank = 1;
                break;
            case 5:
                rank = 2;
                break;
            case 4:
                rank = 3;
                break;
            case 3:
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            case 1:
            case 0:
                rank = 6;
                break;
        }
        return rank;
    }
}