package 프로그래머스.레벨1;
/*
* 유한소수이면 return 1
* 무한소수라면 return 2
*
* 유한소수 조건
* - 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야한다.
* - 기약분수로 나타내기 기약분수란 1이외에 공통 인수가 없는 분수 = 더 이상 약분되지 않는 분수
* - 분자와 분모의 최대공약수(gcd)를 구한뒤, 최대공약수로 분자와 분모를 나누어주면 기약분수가 된다.
*
* - 최대공약수는 유클리드 호제법을 이용하면 된다.
* - 호제법이란 서로 상대방의 수로 나누워서 결국 원하는 수를 얻는 알고리즘을 말한다.
* - 자연수 a, b(a>b)에 대해서 a를 b로 나눈 나머지를 r이라고 한다면, a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
* - 결국 과정을 계속 반복해서 나머지가 0이 되었을 때 나누는 수가 최대공약수가 된다.
* - 6/8 3/4 2/13
*
* */
public class 유한소수판별하기 {
    public int solution(int a, int b) {
        int answer = 0;
        b = b/gcd(a,b);

        for (int i=2; i<=b; i++) {  // 2
            while (b%i == 0) {
                if (i != 2 && i!= 5) {
                    return 2;
                }
                b = b/i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        유한소수판별하기 sol = new 유한소수판별하기();
        System.out.println(sol.solution(11,22));
    }
    // 유클리드 호제법
    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0)
            return a;

        return gcd(b, a%b);
    }
}
