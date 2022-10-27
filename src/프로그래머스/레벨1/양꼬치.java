package 프로그래머스.레벨1;
/*
* 1.양꼬치 계산 = 12000*n +
* 2.음료 계산 = 2000 * k  +
* 3.서비스 계산 = 2000 * (n/10) --
*
* */
public class 양꼬치 {
    public int solution(int n, int k) {
        int yangPrice = 12000*n;
        int beverPrice = 2000*k;
        int service = (n/10)*2000;

        return yangPrice + beverPrice - service;
    }
}
