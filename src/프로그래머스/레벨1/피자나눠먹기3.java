package 프로그래머스.레벨1;
/*
* 사람당 최소 한 조각은 먹으려면 최소 몇 판의 피자가 필요할까?
* 필요한 피자 갯수 = (사람 수 / 피자 조각 수 ) 올림
* */
public class 피자나눠먹기3 {
    public int solution(int slice, int n) {
        return (int)Math.ceil((double) n / slice);
    }
}
