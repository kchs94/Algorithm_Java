package 백준.기본수학2.터렛_1002;

/*
* 좌표개념:
* 1. 두 원의 중심이 같고 반지름도 같을 때: 접점 개수 무한
* 2-1. 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때.
* 2-2. d < |r1-r2|
* 3-1: d = |r1-r2|
* 3-2: d = r1+r2
* 4. 두 접점을 가지는 경우
*
* 참고: 부동소수점은 근사치로 계산하기에 비교할 때는 최대한 double,float을 자제한다.
*
* 결국 두 원의 접점이 몇 개 있는지 구하는 경우의 수 문제.
* */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 터렛_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력준비
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 갯수 입력받기

        StringTokenizer st;
        int x1, y1, r1, x2, y2, r2;
        StringBuilder sb = new StringBuilder();

        // 각 테스트케이스별로 입력받고 알고리즘 수행해서 출력하기
        for (int i = 0; i < T; i++) {

            // 입력
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            sb.append(tangent_point(x1,y1,r1,x2,y2,r2)).append('\n');
        }
        System.out.println(sb);
    }

    // 접점 갯수를 구하는 함수
    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2){

        int distance_pow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));  // 중점간 거리 distance의 제곱


        // case 1: 접점의 개수한 무한 개일 경우.
        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;

        // case 2-1: 외부에서 접점이 없는 경우
        else if(distance_pow > Math.pow(r1 + r2, 2)) return 0;

        // case 2-2: 내부에서 접점이 없는 경우
        else if(distance_pow < Math.pow(r1 - r2, 2)) return 0;

        // case 3-1: 내접
        else if(distance_pow == Math.pow(r1- r2, 2)) return 1;

        // case 3-2: 외접
        else if(distance_pow == Math.pow(r1 + r2, 2)) return 1;
        
        // case 4: 두 점에서 접하는 경우
        else return 2;
    }
}