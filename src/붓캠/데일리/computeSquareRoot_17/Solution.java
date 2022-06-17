package 붓캠.데일리.computeSquareRoot_17;
/*
* 제곱근을 구하는 방법 중 하나: 바빌로니아 방법
* Xn+1 = 1/2(Xn + S*\/Xn)
* */
public class Solution {
  public static String computeSquareRoot(int num) {
    double approximation = 1;	// 근사값

    for (int i=0; i<10; i++) {	// 10번정도 반복
      approximation = (approximation + num/approximation) / 2;
    }

    return String.format("%.2f",approximation);
  }

  public static void main(String[] args) {
    System.out.println(computeSquareRoot(6));
  }
}
