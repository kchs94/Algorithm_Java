package 붓캠.데일리.ABCeck_09;

public class Solution {
  public boolean ABCheck(String str) {
    if (str.length() < 5) return false;

    int start = 0;
    int end = 4;
    str = str.toLowerCase();

    for (int i = 0; i<=str.length()-5; i++ ) {
      if (str.charAt(start) == 'a' && str.charAt(end) == 'b') return true;
      if (str.charAt(start) == 'b' && str.charAt(end) == 'a') return true;
      start++;
      end++;
    }

    return false;
  }
}
