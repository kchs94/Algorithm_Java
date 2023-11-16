package 프로그래머스.레벨2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;
/*
* 최단거리 + 2차원 배열 --> bfs
* */
public class Solution {
//    int[] dx = {1, 0, -1, 0};
//    int[] dy = {0, 1, 0, -1};

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int answer = 0;

        int row = maps.length;
        int col = maps[0].length;

        int[][] visited = new int[row][col];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0){
            answer = -1;
        }

        return answer;
    }

    public void bfs(int[][] maps, int[][] visited){
        /*int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));*/

        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<Point1> q = new LinkedList<>();
        q.add(new Point1(x, y));

        /*while(!q.isEmpty()){
            Point curPoint = q.poll();
            int curX = curPoint.x;
            int curY = curPoint.y;

            for(int i = 0; i < 4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx < 0 || nx > maps.length-1 || ny < 0 || ny > maps[0].length-1)
                    continue;
                // 방문하지 않고 길이라면
                if(visited[nx][ny] == 0 && maps[nx][ny] == 1){
                    visited[nx][ny] = visited[curX][curY] + 1;
                    q.add(new Point(nx,ny));
                }
            }

        }*/
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}}));
    };
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point1 {
    int x;
    int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

}