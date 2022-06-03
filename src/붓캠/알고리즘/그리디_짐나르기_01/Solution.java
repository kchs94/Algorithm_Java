package 붓캠.알고리즘.그리디_짐나르기_01;
import java.util.*;

public class Solution {
  public int movingStuff(int[] stuff, int limit) {
    Integer[] newArray = new Integer[stuff.length];
    int i = 0;
    for (int value : stuff) {
      newArray[i++] = Integer.valueOf(value);
    }
    // stuff 배열을 내림차순으로 정렬한다.
    Arrays.sort(newArray, Collections.reverseOrder());
    // answer 변수를 0으로 초기화한다.
    // 박스의 총 용량을 담을 capacity 변수를 선언한다.
    int answer = 0;
    int capacity = 0;
    // 배열을 순회한다.
    for (int currentWeight : newArray) {
      capacity += currentWeight;
      if (capacity > limit / 2) {
        capacity = 0;
        answer++;
      }
    }
    return answer;
    // capacity += 현재 무게
    // if (capacity > limit/2) {
    //  capacity = 0;
    //  answer++;
    // }
    //
  }
}
