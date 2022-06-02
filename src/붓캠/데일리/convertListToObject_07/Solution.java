package 붓캠.데일리.convertListToObject_07;
import java.util.*;

public class Solution {
  public static HashMap<String, String> convertListToHashMap(String[][] arr) {
    // HashMap을 생성합니다.
    HashMap<String, String> map = new HashMap<>();
    // if arr이 빈배열 return 빈HashMap
    if (arr.length == 0) return map;
    // 배열을 행을 순회한다.
    for (int row=0; row<arr.length; row++) {
      // !첫 번째 요소를 key로하는 entry가 없으면 넣어준다 --> map.contains(), map.put()
      String key = arr[row][0];
      String value = arr[row][1];
      if(!map.containsKey(key)) map.put(key, value);
    }
    return map;
  }

  public static void main(String[] args) {
    System.out.println(convertListToHashMap(new String[][]{}));
  }
}
