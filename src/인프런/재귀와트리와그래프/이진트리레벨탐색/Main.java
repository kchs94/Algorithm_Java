package 인프런.재귀와트리와그래프.이진트리레벨탐색;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {
    Node root;

    public void BFS(Node root) {
        Queue<Node> q = new LinkedList<>(); // 큐 선언
        q.offer(root);  // 루트 노드 넣기
        int level = 0;  // 레벨 0 초기화

        while(!q.isEmpty()) {   // 큐가 비어있을 때까지 반복한다.
            int len = q.size(); // q 원소의 갯수
            System.out.print(level + ": ");
            for (int i=0; i<len; i++) { // q에 있는 원소갯수만큼 반복
                Node current = q.poll();
                System.out.print(current.data + " ");
                if (current.left != null)   // 왼쪽 자식이 있으면 넣어준다
                    q.offer(current.left);
                if (current.left != null)   // 오른쪽 자식이 있으면 넣어준다.
                    q.offer(current.right);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.BFS(tree.root);
    }
}
