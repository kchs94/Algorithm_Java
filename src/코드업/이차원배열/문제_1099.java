package 코드업.이차원배열;

/*
* 입력: 10*10 크기의 미로 구조와 먹이 위치가 입력된다.
* 출력: 개미가 이동한 경로를 9로 표시해 출력
* 알고리즘
* 1-1. 현재 자리가 2라면 목적지 이므로 9를 넣고 반복문 탈출
* 1-2. 현재 자리가 2가 아니면 그 자리를 9로 넣음
* 2-1. 오른쪽이 0또는 2이면 x값 증가
* 2-2. 오른쪽이 1이고
* 2-2-1. 아래쪽이 0또는 2이면 y값 증가
* 2-2-2. 아래쪽이 1이면 루프 탈출.
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class 문제_1099 {
    public static void main(String[] args) throws IOException{
        int[][] maze = new int[11][11]; // 미로
        int x=2,y=2;    // 출발점

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 입력
        for(int i=1; i<=10; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=10; j++){
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        while(true){
           if(maze[y][x] == 2){
               maze[y][x] = 9;
               break;
           }
           maze[y][x] = 9;

           if(maze[y][x+1] == 0 || maze[y][x+1] == 2){
               x++;
           }
           else if(maze[y][x+1] == 1){
               if(maze[y+1][x] == 0 || maze[y+1][x] ==2){
                   y++;
               }
               else if(maze[y+1][x] == 1){
                   break;
               }
           }
        }


        // 출력
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                sb.append(maze[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
