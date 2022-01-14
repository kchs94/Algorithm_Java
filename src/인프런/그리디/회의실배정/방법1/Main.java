package 인프런.그리디.회의실배정.방법1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {    // 객체를 생성할 때 인스턴스 변수값 설정
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.end == o.end)  // 종료 시간이 같다면 
            return this.start - o.start;    // 시작 시간으로 정렬
        else    // 종료시간이 다르면 종료 시간으로 정렬
            return this.end - o.end;
    }
}

public class Main {
    public int solution(int n, ArrayList<Meeting> list) {
        int answer=0;

        Collections.sort(list); // 정렬
        
        int endMeeting = 0; // 초기 설정
        for (Meeting Meeting : list) {
            if (endMeeting <= Meeting.start) {  // 전 회의 끝날시간보다 현재 미팅 시작이 크거나 같다면
                answer++;
                endMeeting = Meeting.end;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Meeting> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            list.add(new Meeting(start, end));
        }
        System.out.println(T.solution(n, list));
    }
}
