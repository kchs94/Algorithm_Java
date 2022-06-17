package 붓캠.데일리.computeSquareRoot_17;
/*
* 제곱근을 구하는 방법 중 하나: 바빌로니아 방법
* Xn+1 = 1/2(Xn + S*\/Xn)
*
*
* */
public class Solution {
  public static String computeSquareRoot(int num) {
    double approximation = 1;
    int count = 0;

    while (approximation*approximation != num) {
      if (count == 10) break;
      approximation = (approximation + num/approximation) / 2;
      count++;
    }

    return String.format("%.2f",approximation);
  }

  public static void main(String[] args) {
    System.out.println(computeSquareRoot(6));
  }
}
