package 프로그래머스.레벨1;
/*
* a1-a0 == a2-a1 이면 등차
* 등차수열 일반항 an = dn + a1
*
* 그게아니라면 등비
* 등비수열 일반항 an = a1.r^(n)
*
* */
public class 다음에올숫자 {
    public int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) {
            int d = common[1] - common[0];
            return common[1] + d*(common.length);
        }
        else {
            int r = common[1] / common[0];
            return common[0]*(int)Math.pow(r, common.length);   // 2*2^3
        }
    }
}
