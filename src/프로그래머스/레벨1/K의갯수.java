package 프로그래머스.레벨1;

/*
 * 방법1.String.contains를 사용하고싶은데 형 변환을 해야됨
 * 방법2.만약 int 그대로한다면 /,%연산을 이용해서 할 수 있을거 같다.
 * ====
 * 방법1로 했다가 케이스1번에서 막혔다. 문제를 자세히 읽어보니 1그리고 11의 경우 2번 카운트해야된다..!
 * */
public class K의갯수 {
    public int solution(int i, int j, int k) {
        int count = 0;

        for (int x = i; x <= j; x++) {
            int num = x;
            while (num != 0) {
                if (num % 10 == k) count++;

                num /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        K의갯수 sol = new K의갯수();
        System.out.println(sol.solution(1, 13, 1));
    }

}
