package 붓캠.재귀.arrSum_05;
import java.util.*;
// 재귀함수를 이용해서 배열의 모든 요소의 합을 구하는 문제
// 처음보는 형태라 낯설지만 반복되는 구조를 보면 첫 번째 요소와 나머지 배열로 볼 수 있다.
// 만약 배열의 길이가 0이라면(빈배열)이라면 탈출할 수 있는 조건이다.
// 그 외라면 첫 번째 요소값 + 재귀함수(나머지 배열)로 값을 반환한다.
// 느낀점: 배열을 특정 요소부터 특정 요소까지 깊은 복사를 하고 싶으면 Arrays.copyOfRange()를 기억하자.
public class Solution {
  public int arrSum(int[] arr){
    if (arr.length == 0) return 0;
    else {
      int head = arr[0];
      int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
      return head + arrSum(newArr);
    }
  }
}

