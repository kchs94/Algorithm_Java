package 프로그래머스.레벨1.소수찾기;

// 소수(prime number): 약수가 1과 자기 자신뿐인 1보다 큰 자연수. ex. 2, 3, 5, 7. 즉 소수는 약수를 총 2개를 갖는데 하나는 1이며 하나는 자기 자신이다.
// 약수(divisor): 어떤 정수를 나누어 떨어지게(=나머지가 0인) 하는 0이 아닌 정수. ex. 4의 약수:1, 2, 4
// 소인수: 인수 중에 소수인 것.
// 소인수분해: 모든 정수들은 소인수들의 곱으로만 표현 가능. 이것을 소인수 분해라한다.
// 10의 소수: 2, 3, 5, 7
// 소수 구하기:
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            if(isPrime(i)) answer++;
        }

        return answer;
    }
    // 소수를 판별하는 메소드
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}