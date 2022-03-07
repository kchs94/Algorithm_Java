package 인프런.재귀와트리와그래프.그래프와인접행렬;
/*
* 그래프와 인접행렬 이론
*
* 그래프는 노드와 간선으로 구성된다.
* G(Vertex,Edge)
* <인접행렬로 풀기>
* 1.무방향그래프: 노드 사이에 화살표가 없다. 즉 양방향이다.
*
* 입력 예시
* 1 2 :1노드와 2노드 연결
* graph[1Node][2Node] = 1or0
* 행렬로 그래프를 표현한 것을 인접행렬이라고 한다.
* 인접행렬은 2차원배열로 표현한다
* 인덱스 번호는 노드 번호다.
* 0은 연걸이 안된 상태, 1은 연결이 된 상태를 의미한다.
* 해석
* (a,b)값이 1이다. = a노드와 b노드는 연결되있다.
*
* 2.방향그래프: 노드 사이에 화살표가 있다.
* graph[from][to] = 1or0
*
*
* 3.가중치 그래프: 간선에 값까지 있는 그래프이다. 1대신 가중치를 적는다.
* 입력 예시
* 1 2 2:출발노드 도착노드 가중치
* graph[from][to] = value
*
* <인접리스트로 풀기>
* -정점 갯수가 많을 때 인접행렬로 풀면 메모리가 낭비되고 시간복잡도도 높아지기 때문에 인접리스트로 풀어야 한다.
* * */
public class Main {
}
