package 붓캠.재귀.arrProduct_06;
import java.util.*;
// 재귀함수를 이용하여 배열의 모든 요소의 곱을 구하는 문제
// 첫 번째 요소와 부분배열로 나누어 반복적으로 곱한다.
// 재귀함수는 반드시 if-else로 문제를 푼다
// 탈출조건은 배열이 빈배열인 경우 1을 반환하여 탈출한다.
// 그 외에는 첫 번째 요소와 부분 배열을 구해 첫 번째 요소와 재귀함수를 계속 곱해나간다.
// 느낀점: 문제 해결방식이 앞 문제와 같아 쉽게 풀 수 있었다.
public class Solution {
  public int arrProduct(int[] arr){
    if (arr.length == 0) return 1;
    else {
      int first = arr[0];
      int[] partArr = Arrays.copyOfRange(arr, 1, arr.length);
      return first * arrProduct(partArr);
    }
  }
}

