package 프로그래머스.레벨2.문자열압축;
/*
*
*
* */
public class Solution {
  public static int solution(String s) {
    int answer = 0;
    int min = Integer.MAX_VALUE;

    char[] arr = s.toCharArray();
    for (int i=1; i<s.length()/2; i++) {
      String present = s.substring(0, i);



    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution("aabbaccc"));
  }
}
