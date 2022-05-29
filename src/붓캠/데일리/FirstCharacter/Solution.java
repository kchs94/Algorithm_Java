package 붓캠.데일리.FirstCharacter;

// str = "" --> return str
public class Solution {
  public String firstCharacter(String str) {
    // 공백을 구분자로하여 문자열을 단어로 쪼개 문자열 배열에 넣습니다.
    // 배열을 순회하면서 각 요소의 첫 문자에 접근하여 문자열을 이어줍니다.
    // 이어준 문자열을 반환합니다.
    if (str.equals("")) return str;

    String[] words = str.split(" ");

    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(word.charAt(0));
    }

    return sb.toString();
  }
}
