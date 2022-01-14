package 인프런.재귀와트리와그래프.이진트리순회;

class Node {    // 노드 클래스
    int data;   // 값
    Node lt, rt;    // 인스턴스 변수(=필드, 멤버변수): 노드의 주소를 저장함
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}


public class Main {
    Node root;

    // 재귀
    public void DFS(Node root) {
        if (root == null) return;
        else {
            System.out.println(root.data + " ");
            DFS(root.lt);   // 왼쪽으로 가기
            DFS(root.rt);   // 오른쪽으로 가기
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
