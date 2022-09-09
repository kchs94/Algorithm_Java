package 프로그래머스.레벨2.피로도;

public class Solution {
    static boolean checked[];
    static int answer = 0;

    public static void dfs(int tired, int[][] dungeons, int count) {

        for (int i=0; i< dungeons.length; i++) {

            // 방문하지 않은 던전이고 최소 필요 피로도 <= 현재 피로도
            if(!checked[i] && dungeons[i][0] <= tired) {
                checked[i] = true;
                dfs(tired-dungeons[i][1], dungeons, count+1);
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
