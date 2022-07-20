package 붓캠.데일리.robotPath_33;

public class Solution {

    int[] dx = {0, 0, -1, 1};   // 상하좌우
    int[] dy = {-1, 1, 0, 0};
    int[][] map;
    int[] src;
    int[] dst;

    int min = Integer.MAX_VALUE;
    int count = 0;

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.robotPath(
                new int[][]{
                        {0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0},
                        {0, 1, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0, 0}
                },new int[]{4, 3},new int[]{2, 2}
        ));
    }

    public int robotPath(int[][] room, int[] src, int[] dst) {
        this.map = room.clone();
        this.src = src.clone();
        this.dst = dst.clone();
        int y = src[0];
        int x = src[1];
        dfs(y,x);

        return min;
    }

    public void dfs(int y, int x) {
        if (count > min) return;

        if(y == dst[0] && x == dst[1]) {
            min = Math.min(min, count);
            return;
        }
        else {
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < map[0].length && ny >= 0 && ny < map.length && map[ny][nx] == 0) {
                    count++;
                    map[ny][nx] = 1;
                    dfs(ny, nx);
                    map[ny][nx] = 0;
                    count--;
                }
            }
        }
    }
}
