package 인프런.그리디.원더랜드_크루스칼_Uion_Find;

/*
* 최소 스패닝 트리:  그래프에서 간선의 가중치 합이 최소인 트리를 뽑아내는 문제.
* 그래프: 회로가 존재한다.
* 트리: 회로가 존재하지 않는다. 정점 N개 라면, 간선 N-1개
* 그래프에서 트리를 뽑아내는 알고리즘: 크루스칼 알고리즘
* 그리고 그루스칼 알고리즘은 Union&Find 를 이용해서 구한다.
*
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
  public int v1;
  public int v2;
  public int cost;
  Edge(int v1, int v2, int cost) {
    this.v1 = v1;
    this.v2 = v2; 
    this.cost = cost;
  }

  @Override
  public int compareTo(Edge ob) {
    return this.cost - ob.cost;
  }
}

public class Solution {
  static int[] unf;
  public static int find(int v) {
    if (v == unf[v]) return v;
    else return unf[v] = find(unf[v]);
  }
  public static void union(int a, int b) {
    int fa = find(a);
    int fb = find(b);
    if (fa != fb) unf[fa] = fb;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    unf = new int[n+1];
    ArrayList<Edge> list = new ArrayList<>();
    for (int i=1; i<=n; i++) unf[i] = i;
    for (int i=0; i<m; i++) {
      int v1 = in.nextInt();
      int v2 = in.nextInt();
      int cost = in.nextInt();
      list.add(new Edge(v1, v2, cost));
    }
    int answer = 0;
    Collections.sort(list);
    for (Edge ob : list) {
      int fv1 = find(ob.v1);
      int fv2 = find(ob.v2);
      if (fv1 != fv2) {
        answer += ob.cost;
        union(ob.v1, ob.v2);
      }
    }
    System.out.println(answer);
  }
}
