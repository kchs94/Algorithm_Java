package 붓캠.데일리.convertDoubleSpaceToSingle;

public class Solution {
  public String convertDoubleSpaceToSingle(String str) {
    return str.replaceAll(" +", " ");
  }
}
