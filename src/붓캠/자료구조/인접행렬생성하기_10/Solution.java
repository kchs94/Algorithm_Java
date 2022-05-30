package 붓캠.자료구조.인접행렬생성하기_10;

// 그래프는 인접행렬 또는 인접리스트로 표현할 수 있다.
public class Solution {
  public static int[][] createMatrix(int[][] edges) {
    // 배열을 돌면서 가장 큰 값을 찾고 +1한 값만큼의 사이즈를 가지는 2차원 매트릭스 생성
    // 배열을 순회한다.
    // 1열에서 from을 선택하고 2열을 보고 to를 선택한고 해당 인덱스에 값을 1할당한다.
    // 3열에서 1(양방향)이면  반대에도 1을 할당한다.
    // matrix를 반환한다.

    int size = Integer.MIN_VALUE;
    for (int row = 0; row < edges.length; row++) {
      for (int col = 0; col < 2; col++) {
        if (edges[row][col] > size) size = edges[row][col];
      }
    }
    int[][] matrix = new int[size + 1][size + 1];

    for (int row = 0; row < edges.length; row++) {
      int from = edges[row][0];
      int to = edges[row][1];
      matrix[from][to] = 1;
      if (edges[row][2] == 1) matrix[to][from] = 1;
    }
//    System.out.println(Arrays.deepToString(matrix));
    return matrix;
  }

  public static void main(String[] args) {
    System.out.println(createMatrix(new int[][]{
            {0, 2, 0},
            {2, 4, 1},
            {1, 3, 1},
            {2, 1, 0},

    }));
  }
}

