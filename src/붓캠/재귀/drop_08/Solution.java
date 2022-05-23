package 붓캠.재귀.drop_08;
import java.util.*;
// 재귀함수를 이용해서 입력으로 주어진 num만큼 앞 요소부터 num개의 요소가 제거된 새로운 배열을 반환해야하는 문제
// 앞 문제와 같이 head, tail 방식으로 접근하면 될 것 같다.
// 예외적으로 만약 num >= 배열의 길이일 경우 빈 배열을 리턴한다.
// 재귀적으로 한 번 반복할 때마다 num값은 1씩 줄이고, 앞 요소가 제거된 새로운 배열을 호출하면된다.
// 만약 num이 0이되면 줄어든 배열을 반환하면 된다.
// 그 외에는 계속 재귀적으로 함수를 호출하면 된다.
// 의문: 빈 배열은 정확이 무엇인가??
public class Solution {
  public int[] drop(int num, int[] arr){
    if (num >= arr.length) return new int[]{};

    if (num == 0) return arr;
    else return drop(num-1, Arrays.copyOfRange(arr, 1, arr.length));
  }
}
