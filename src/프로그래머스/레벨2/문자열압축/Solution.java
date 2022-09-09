package 프로그래머스.레벨2.문자열압축;

public class Solution {
  public int solution(String s) {
    int answer = Integer.MAX_VALUE;
    StringBuilder sb = new StringBuilder();
    for (int i=1; i<s.length()/2; i++) {// aa ab bb be


      int j=0;
      int count = 1;
      while (j+2*i <= s.length()) {

        String frond = s.substring(j, j+i);
        String back = s.substring(j+i, j+2*i);
        if (frond.equals(back))
          count++;
        else {
          if (count == 1)
            sb.append(frond);
          else {
            sb.append(count).append(frond);
            count = 1;
          }
        }

        j += i;
        if (j+2*i >  s.length())
          sb.append(count).append(frond);
      }

      String compactStr = sb.toString();
      if (answer > compactStr.length())
        answer = compactStr.length();

    }

    return answer;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution("abcabcdede"));
  }
}
