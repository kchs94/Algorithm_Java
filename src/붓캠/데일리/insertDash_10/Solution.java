package 붓캠.데일리.insertDash_10;

public class Solution {
  public String insertDash(String str) {

    if (str.isEmpty()) return null;	// 빈 문자열 처리


    StringBuilder sb = new StringBuilder();
    // 문자열의 길이-1만큼 순회합니다.
    for (int i = 0; i<str.length()-1; i ++) {
      char presentLetter = str.charAt(i);
      char nextLetter = str.charAt(i+1);
      // 현재 문자를 붙여줍니다.
      sb.append(presentLetter);
      // 현재 문자와 다음 문자 모두 홀수라면 현재 문자 + "-"를 붙여줍니다.
      if (presentLetter%2 == 1 && nextLetter%2 == 1)
        sb.append("-");
    }

    // 처리못한 마지막 요소 처리
    sb.append(str.charAt(str.length()-1));

    return sb.toString();
  }
}
