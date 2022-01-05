package 인프런.재귀와트리와그래프.이진수출력.방법2;
/*
* 재귀함수 안에서 출력을 하는 방법2
* */
public class Main {
    public void DFS(int n) {
        if (n == 0){
            return;
        }
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}
