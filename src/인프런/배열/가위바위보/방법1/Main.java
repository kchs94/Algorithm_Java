package 인프런.배열.가위바위보.방법1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public final static int SCISSORS = 1;
    public final static int ROCK = 2;
    public final static int PAPER = 3;

    public ArrayList<Character> solution(int n, int[][] arr) {
        ArrayList<Character> list = new ArrayList<>();

        for(int j=0; j < arr[1].length; j++) { // 판 갯수만큼 반복한다.
            if( (arr[0][j] == SCISSORS && arr[1][j] == PAPER) ||
                    (arr[0][j] == ROCK && arr[1][j] == SCISSORS) ||
                    (arr[0][j] == PAPER && arr[1][j] == ROCK)) {  // A가 이겼을 때: 가위, 바위,보
                list.add('A');
            }
            else if ( (arr[0][j] == SCISSORS && arr[1][j] == ROCK) ||
                    (arr[0][j] == ROCK && arr[1][j] == PAPER) ||
                    (arr[0][j] == PAPER && arr[1][j] == SCISSORS)){   // B가 이겼을 때
                list.add('B');
            }
            else {
                list.add('D');
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] arr = new int[2][N];
        for(int i=0; i<2; i++) {

            for(int j=0; j<N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : T.solution(N, arr)) {
            sb.append(character + "\n");
        }
        System.out.println(sb);
    }
}
