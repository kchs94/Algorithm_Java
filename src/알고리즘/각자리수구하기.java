package 알고리즘;

// 자리수를 구할 수를 10으로 나머지 연산과 나눗셈 연산을 통해 자리수의 값을 얻을 수 있습니다.
public class 각자리수구하기 {
    public static void main(String[] args) {
        int n = 12345;
        int digit=0;
        while(n != 0){
            digit = n%10; // 자리수 구하기
            n = n/10;     // 다음 자리수 구할 준비
        }
    }
}
