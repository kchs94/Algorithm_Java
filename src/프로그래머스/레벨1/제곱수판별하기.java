package 프로그래머스.레벨1;
/*
* Math.sqrt를 사용해서 int로 형변환 것과 값이 같다면 제곱수다.
* 144 --> 12.0 == (int) 12.0 은 참이므로 144는 제곱수
* */
public class 제곱수판별하기 {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        if (sqrt == (int)sqrt )
            return 1;
        else
            return 2;
    }
}
