package 붓캠.데일리.removeExtremes11;
import java.util.*;

public class Solution {
  public static String[] removeExtremes(String[] arr) {
    // 공백을 입력받으면 null을 반환합니다.
    if (arr.length == 0) return null;
    // 배열의 길이가 1인 경우는 없습니다.
    // 가장 짧은 문자열 또는 가장 긴 문자열이 여러 개이면, 나중에 위치한 문자열을 제거합니다.
    int max = Integer.MIN_VALUE;
    int maxIndex = 0;

    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    ArrayList<String> list = new ArrayList<>();
    // 가장 짧은 문자열, 가장 긴 문자열 인덱스 찾기
    for (int i=0; i<arr.length; i++) {
      if (arr[i].length() >= max){
        max = arr[i].length();
        maxIndex = i;
      }
      if (arr[i].length() <= min) {
        min = arr[i].length();
        minIndex = i;
      }
    }
    // 가장 짧은 문자열, 가장 긴 문자열 인덱스만 빼고 넣어주기
    for (int i=0; i<arr.length; i++) {
      if(i != minIndex && i != maxIndex) list.add(arr[i]);
    }

    String[] answer = new String[list.size()];
    return list.toArray(answer);

  }

  public static void main(String[] args) {
    for (String str : removeExtremes(new String[]{"where", "is", "the", "longest", "word"})) {
      System.out.print(str + " ");
    }
  }
}
