package 붓캠.알고리즘.순열_새로운치킨레시피_06;
import java.util.*;
/*
* stuffArr에서 신선한 재료들만 찾는다.
*
* 신선한 재료들이 담긴게 <choiceNum 또는 0이면 return null.
*
* 신선한 재료들 정렬하기 Collections.sort
*
* dfs 방식으로 순열을 만들어주기기*
* */
public class Solution {

  ArrayList<Integer[]> answer = new ArrayList<>();
  boolean[] visited;

  public void dfs(int depth, int choiceNum, Integer[] arr, ArrayList<Integer> list) {
    if (depth == choiceNum) {
      answer.add(arr.clone());
      return;
    }
    for (int i=0; i<list.size(); i++) {
      if (!visited[i]) {
        visited[i] = true;
        arr[depth] = list.get(i);
        dfs(depth+1, choiceNum, arr, list);
        visited[i] = false;
      }
    }
  }


  public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
    //  stuffArr에서 신선한 재료들만 찾는다.
    ArrayList<Integer> list = new ArrayList<>();
    for (int i=0; i<stuffArr.length; i++) {
      /*String str = String.valueOf(stuffArr[i]);
      int count = 0;
      for (int j=0; j<str.length(); j++) {
        if (str.charAt(j) == '0') count++;
      }
      if (count < 3) {
        list.add(stuffArr[i]);
      }*/
      if (Integer.toString(stuffArr[i]).chars().filter(ch -> ch=='0').count() < 3)
        list.add(stuffArr[i]);
    }
    //신선한 재료들이 담긴게 <choiceNum 또는 0이면 return null.
    if(list.size() == 0 ||list.size() < choiceNum) return null;

    //신선한 재료들 정렬하기 Collections.sort
    Collections.sort(list);

    //dfs 방식으로 순열을 만들어주기기*
    visited = new boolean[list.size()];
    dfs(0, choiceNum, new Integer[choiceNum], list);
    return answer;
  }
}
