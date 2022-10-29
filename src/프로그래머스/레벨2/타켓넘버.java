package 프로그래머스.레벨2;
/*
* 배열에 있는 원소에 +, - 를 적절히 이용하여 타겟넘버를 만들수 있는 모든 경우의 수의 합을 출력한다.
*
*
*
* */
public class 타켓넘버 {
    static int[] numbers;
    static int target;
    static int count = 0;


    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;

        dfs(numbers[0], 1);
        dfs(-numbers[0], 1);

        return count;
    }

    public static void dfs(int sum, int depth) {
        if (depth == numbers.length) {
            if (sum == target)
                count ++;
        } else {
            dfs(sum + numbers[depth], depth+1 );
            dfs(sum - numbers[depth], depth+1 );
        }
    }
}
