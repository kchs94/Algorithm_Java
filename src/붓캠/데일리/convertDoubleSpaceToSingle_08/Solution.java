package 붓캠.데일리.convertDoubleSpaceToSingle_08;

public class Solution {
  public String convertDoubleSpaceToSingle(String str) {
    return str.replaceAll(" +", " ");
  }
}
