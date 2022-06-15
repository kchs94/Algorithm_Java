package 붓캠.데일리.modulo_15;

public class Solution {
  public Integer modulo(int num1, int num2) {
    if (num1 == 0) return 0;
    if (num2 == 0) return null;

    while(num1>= num2) {
      num1 -= num2;
    }
    return num1;
  }
}
