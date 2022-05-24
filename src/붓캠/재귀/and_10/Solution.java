package 붓캠.재귀.and_10;
import java.util.*;
// 재귀함수를 이용해서 입력받은 boolean형의 배열의 모든 요소의 논리곱을 리턴하는 문제
// 한 요소씩 반복적으로 접근하여 요소를 곱해줍니다.
// true
// true&&and(부분배열)
// true&&true&&(부분배열)
// 언제 탈출할까? 배열의 길이가 0일때 탈출한다!
// 만약 배열의 길이가 0이라면 0을 반환한다.
// 그외라면
//   재귀 도중에 첫 번째 요소값이 false라면 뒤 연산을 안봐도 false이므로 바로 탈출한다.
//   첫 번째 요소 && and(부분배열)
public class Solution {
  public boolean and(boolean[] arr){
    if (arr.length == 0) return true;
    else {
      if(arr[0] == false) return false;
      return arr[0] && and(Arrays.copyOfRange(arr, 1, arr.length));
    }
  }
}
