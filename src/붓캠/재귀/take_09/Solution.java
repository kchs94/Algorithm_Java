package 붓캠.재귀.take_09;
import java.util.*;
// num과 배열을 입력받으면 재귀함수를 이용해서 앞에서부터 num개의 요소로만 구성된 새로운 배열을 리턴하는 문제
// 배열을 첫 요소부터 새롭게 만들어야 하니 Arrays.copyOf가 사용되겠군
// 재귀함수를 이용해야하니 뒤의 요소부터 한 개씩 줄어드는 배열을 만들면 되겠군
// 만약 num == 0이라면 빈배열을 리턴한다.
// 만약 num이 배열의 요소의 갯수보다 크거나 같다면 연산할게 없으니 바로 깊은복사로 생성한 배열을 리턴한다.
// 만약 num과 배열의 갯수가 같으면 num개의 요소로만 구성된 배열이므로 리턴한다.
// 그 뒤 요소가 하나 줄어든 배열을 다시 입력으로 넣어 메소드를 호출한다.
public class Solution {
  public int[] take(int num, int[] arr){
    if (num >= arr.length) return arr.clone();

    if (num == arr.length) return arr;
    else {
      return take(num, Arrays.copyOf(arr, arr.length-1));
    }
  }
}

