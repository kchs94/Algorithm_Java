package 인프런.그리디.친구인가;

import java.util.Scanner;

/*
* 서로소 집합(Disjoint Set): 두 집합에 공통원소가 없을 때 두 집한은 서로소 관계다.
* 서로소 집합을 만들어 낼 때 union&find 알고리즘을 사용한다.
* 준비물: unf 배열, find메서드, union 메서드
* 서로소 집합을 unf 배열을 이용해서 표현한다.
* 인덱스: 학생
*
* */
public class Main {
  static int[] unf;
  // 학생이 소속한 집합 번호를 리턴해준다.
  public static int Find(int v) {
    if (v == unf[v]) return v;
    else return unf[v] = Find(unf[v]);
  }
  // union: 두 원소를 한 집합으로 만들어준다.
  public static void union(int a, int b) {
    int fa = Find(a);
    int fb = Find(b);
    if (fa != fb) unf[fa] = fb;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    unf = new int[n+1];
    for (int i=1; i<=n; i++) unf[i] = i;
    for (int i=1; i<=m; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      union(a, b);
    }
    int a = in.nextInt();
    int b = in.nextInt();
    int fa = Find(a);
    int fb = Find(b);
    if (fa == fb) System.out.println("YES");
    else System.out.println("NO");
  }
}
