package 붓캠.재귀.재귀와반복문;

public class Solution {
  public static int factorialUsingRecursion(int num) {
    if (num == 0)
      return 1;
    else
      return num * factorialUsingRecursion(num - 1);
  }

  public static int factorialUisngIteration(int num) {
    int result = 1, i;

    for (i = 2; i<=num; i++)
      result *= i;

    return result;
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.println("입력이 " + num + "이고 재귀를 사용했을 때 결과값: "
            + factorialUsingRecursion(5));
    System.out.println("입력이 " + num + "이고 반복문을 사용했을 때 결과값: "
            + factorialUisngIteration(5));
  }
}
