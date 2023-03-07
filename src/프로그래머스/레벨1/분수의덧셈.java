package 프로그래머스.레벨1;
/*
*
* A*D + B*C / C * D
*
* 1. 통분
* 2.기약분수로 만들기
* */
public class 분수의덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int son = denum1*num2 + denum2*num1;
        int mom = num1*num2;

        int gcd = gcd(son,mom);
        son /= gcd;
        mom /= mom;

        answer[0] = son;
        answer[1] = mom;

        return answer;
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a%b == 0)
            return b;
        return gcd(b, a%b);
    }
}
