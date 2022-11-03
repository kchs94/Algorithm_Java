package Algorithm.binarysearchtree;
/*
* 정렬이 되어있고, 고유한 정수로만 이루어진 배열이 있습니다.
* 이 배열을 이용해서 이진검색트리를 만드세요.
*
* 배열의 원소가 짝수개일 경우 딱 중간이 없으므로 중간 두 숫자 중 앞에있는 값을 중간으로 하는 규칙을 만든다
* 배열의 원소가 홀수이면 중간이 있다.
*
* */

class Tree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    Node root;  // 트리가 시작되는 루트 노드

    /**
     * 재귀 함수 호출 이전에 재귀 호출에 필요한 데이터를 제공하는 함수
     * @param a 배열 정보
     */
    public void makeTree(int[] a) { // 배열 정보를 받아 트리를 만들어주는 함수
        root = makeTreeR(a, 0, a.length - 1);
    }

    /**
     *
     * @param a 배열
     * @param start 시작 인덱스
     * @param end 끝 인덱스
     * @return 루트노드 주소
     */
    public Node makeTreeR(int[] a, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(a[mid]);
        node.left = makeTreeR(a, start, mid - 1);
        node.right = makeTreeR(a, mid + 1, end);
        return node;
    }

    /**
     *
     * @param n 검색할 시작 노드
     * @param find 찾을 데이터
     */
    public void searchBTree(Node n, int find) {
        if (find < n.data) {
            System.out.println("finding Data is smaller than " + n.data);
            searchBTree(n.left, find);
        } else if (find > n.data) {
            System.out.println("finding Data is bigger than " + n.data);
            searchBTree(n.right, find);
        } else {
            System.out.println("찾았습니다!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0; i<a.length; i++) {
            a[i] = i;
        }

        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root, 2);
    }
}
