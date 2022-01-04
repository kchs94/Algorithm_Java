package 인프런.그리디.씨름선수.방법2;

/*
*
*
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public int solution(ArrayList<Body> list, int n) {
        int count = 0;
        Collections.sort(list);
        int max = Integer.MIN_VALUE;

        for (Body body : list) {
            if(body.weight > max) {
                max = body.weight;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Body> list = new ArrayList<Body>();

        int height;
        int weight;
        for(int i=0; i<n; i++) {
            height = in.nextInt();
            weight = in.nextInt();
            list.add(new Body(height, weight));
        }
        System.out.println(T.solution(list, n));

    }
}

class Body implements Comparable<Body> {
    public int height;
    public int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}