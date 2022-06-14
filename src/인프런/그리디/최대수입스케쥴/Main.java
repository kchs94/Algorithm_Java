package 인프런.그리디.최대수입스케쥴;
/*
* 우선순위큐문제
* 디폴트는 작은 값이 우선순위다.
* 큰 값을 우선순위로 하려면 Collections.reverseOrder를 사용한다.
*
*
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
  public int money;
  public int days;
  Lecture(int money, int days) {
    this.money = money;
    this.days = days;
  }

  public int compareTo(Lecture ob) {
    return ob.days - this.days; // 내림차순
  }
}

public class Main {

  static int n, max = Integer.MIN_VALUE;

  public static int solution(ArrayList<Lecture> list ) {
    int answer = 0;
    PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());  // 큰 값을 우선순위로 하기 위해
    Collections.sort(list);
    int index=0;
    for (int days=max; days>=1; days--) {  // 날짜가 하루씩 작아진다.
      for (; index<n; index++) {
        if (list.get(index).days<days) break;
        pQ.offer(list.get(index).money);
      }
      if (!pQ.isEmpty()) answer += pQ.poll(); // 가장 큰 값을 더한다.
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Lecture> list = new ArrayList<>();
    n = in.nextInt();
    for (int i=0; i<n; i++) {
      int money = in.nextInt();
      int days = in.nextInt();
      list.add(new Lecture(money, days));
      if (days > max) max = days; // 제일 큰 날짜를 찾아서 거꾸리 찾는다.
    }
    System.out.println(solution(list));
  }
}
