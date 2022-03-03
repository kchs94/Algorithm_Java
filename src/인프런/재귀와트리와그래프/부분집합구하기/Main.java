package 인프런.재귀와트리와그래프.부분집합구하기;
/*
* 어떤 집합의 모든 부분집합을 출력하는 문제
* */
public class Main {
    static int n;   // 원소의 갯수
    static boolean[] ch;    // 부분 집합의 원소로 사용했는지 안했는지를 기록하는 배열

    public void DFS(int value) {
        if (value == n+1) {     // 범위를 넘어섰을 때 = 값이 1보다 클 때
            String temp = "";
            for (int i=1; i<=n; i++) {
                if (ch[i] == true)
                    temp += (i + " ");
            }
            if (temp.length() > 0)
                System.out.println(temp);
        }
        else {  // 값이 true인 ch 배열의 인덱스 번호를 출력
            ch[value] = true;   // value를 사용한다
            DFS(value+1);   // 왼쪽
            ch[value] = false;
            DFS(value+1);   // 오른쪽
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n=3;
        ch = new boolean[n+1];  // 인덱스 번호는 해당 값을 의미한다.
        T.DFS(1);
    }
}

