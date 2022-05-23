package 붓캠.재귀.arrLength_07;
import java.util.*;
// 재귀함수를 이용하여 입력받은 배열의 길이를 구해야하는 문제
// 만약 빈배열이라면 0을 반환한다.
// 그외에는 값을 1씩 더해주며 배열의 길이를 1씩 줄인다.
// 느낀점: 배열의 값은 중요하지 않다.

public class Solution {
  public int arrLength(int[] arr){
    if (arr.length == 0) return 0;
    else {
      int[] partArr = Arrays.copyOf(arr, arr.length-1);
      return 1 + arrLength(partArr);
    }
  }
}
