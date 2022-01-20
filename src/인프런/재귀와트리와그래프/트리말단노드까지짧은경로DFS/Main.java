package 인프런.재귀와트리와그래프.트리말단노드까지짧은경로DFS;

class Node {
    int data;
    Node lt, rt;

    Node(int data) {
        this.data = data;
        lt = null;
        rt = null;
    }
}

public class Main {
    Node root;
    public int DFS(int L, Node root) {
        if (root.lt == null && root.lt == null)
            return L;
        else
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));
    }
}
