package 프로그래머스.레벨1;
/*
* 직사각형 넓이 = 가로 * 세로
* 오른쪽 상단 좌표와
* 왼쪽 하단 좌표를 구하기
* */
public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {

        int maxX = -256, maxY = -256, minX = 256, minY = 256;

        for (int i=0; i<dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
        }

        return (maxX - minX) * (maxY - minY);
    }
}
