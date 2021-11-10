package 알고리즘.순열;
/*
* 순열(Permutation): 서로 다른 n개 중에서 r개를 순서있게 뽑는 경우의 수.
*
*
* */
public class Permutation {
    public static void main(String[] args) {

        int n = 2;
        int[] arr = {1, 2};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        permutation(arr, output, visited, 0, n, 2);
    }

    static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        // 다 뽑았으면 집에 가야지!
        if(depth == r) {
            print(output, r);
            return;
        }


        for(int i=0; i<n; i++){
            if(visited[i] == false)  {  // 방문 하지 않았으면
                visited[i] = true;      // 방문 체크 하고
                output[depth] = arr[i]; // i번째 값을
                permutation(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }

    static void print(int[] arr, int r) {

        for(int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
