package 해커랭크.자료구조.배열.TwoDArraysDs;

import java.util.Scanner;

// 전체 배열에서 모래 시계를 오른쪽으로 한 칸씩 이동한다.
// 만약 끝에 도달하면 한 칸 아래 맨 왼쪽으로 가서 반복한다.
// 만약 오른쪽 끝에 도달하고 밑에 칸도 없으면 종료한다.
// 모래시계 왼쪽상한 원소를 기준으로 모래시계 모양의 원소들의 합을 구한다.
// 처음 값은 최솟값으로 설정한다
// 만약 이전 값보다 크다면 최댓값 변수를 그 값으로 갱신한다.
// 최댓값 변수를 리턴한다.
public class Solution {
    public static int solution(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int[] dx = {-1,0,1,0,-1,0,1};
        int[] dy = {-1,-1,-1,0,1,1,1};

        for (int i=1; i<5;i++) {
            for (int j=1; j<5; j++) {
                int temp = 0;

                for (int k=0; k<7; k++) {
                    int x = dx[k];
                    int y = dy[k];
                    temp += arr[i+y][j+x];
                }
                max = Math.max(max, temp);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
