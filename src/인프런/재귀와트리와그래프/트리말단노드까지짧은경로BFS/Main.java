package 인프런.재귀와트리와그래프.트리말단노드까지짧은경로BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}

public class Main {
    Node root;
    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>(); // 노드를 저장할 큐 인스턴스 생성
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for (int i=0; i<len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null)
                    q.offer(cur.lt);
                if (cur.lt != null)
                    q.offer(cur.rt);
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
