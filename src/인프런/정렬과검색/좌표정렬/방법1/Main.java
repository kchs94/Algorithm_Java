package 인프런.정렬과검색.좌표정렬.방법1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{   // 좌표
    int x;
    int y;

    public Point(int x, int y) {    // 생성자를 사용해서 인스턴스 변수 초기화
        this.x = x;
        this.y = y;
    }

    @Override   // 객체의 정렬 기준 설정
    public int compareTo(Point ob) {
        if (this.x == ob.x)
            return y - ob.y;
        return x - ob.x;
    }
}

public class Main {
    public ArrayList<Point> solution(int n, int[][] arr) {
        ArrayList<Point> list = new ArrayList<>();  // 리스트 선언
        for (int i=0; i<n; i++) {   // 리스트에 담기
            list.add(new Point(arr[i][0], arr[i][1]));
        }

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        for (Point p : T.solution(n, arr)) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
