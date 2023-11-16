package 프로그래머스.레벨2.피로도;

public class Ex {
    static boolean checked[];
    static int answer = 0;

    public static void dfs(int tired, int[][] dungeons, int count) {

        for (int i=0; i< dungeons.length; i++) {

            if (!checked[i] && dungeons[i][0] <= tired) {
                checked[i] = true;
                dfs(tired-dungeons[i][1], dungeons, count);
                checked[i] = false;
            }
        }

        answer = Math.max(answer, count);
    }

    public int solution(int k, int[][] dungeons) {
        checked = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return answer;
    }
}
