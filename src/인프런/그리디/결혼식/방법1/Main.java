package 인프런.그리디.결혼식.방법1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int time;
    public char state;

    Time(int time, char state) {
        this.state = state;
        this.time = time;
    }

    @Override
    public int compareTo(Time ob) {
        if (this.time == ob.time)
            return this.state - ob.state;
        else
            return this.time-ob.time;
    }
}

public class Main {

    public int solution(ArrayList<Time> list) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(list);
        int count = 0;
        for (Time ob : list) {
            if (ob.state == 's')
                count++;
            else
                count--;
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            list.add(new Time(start, 's'));
            list.add(new Time(end, 'e'));
        }
        System.out.println(T.solution(list));
    }
}
