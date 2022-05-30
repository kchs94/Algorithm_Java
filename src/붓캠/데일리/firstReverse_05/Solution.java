package 붓캠.데일리.firstReverse_05;

public class Solution {
  public static String firstReverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(firstReverse("I love codestates"));
  }
}
