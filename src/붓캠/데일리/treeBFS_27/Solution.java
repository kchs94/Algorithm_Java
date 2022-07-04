package 붓캠.데일리.treeBFS_27;
import java.util.*;
/*
  BFS는 큐를 이용한다

  q.offer(root)
  while(!q.isEmpty()){ 3.Queue가 빌 때 가지 반복
    1. 가장 먼저 넣었던 것을 꺼내서
    Node curNode = q.poll();

    if(curNode.getChildren != null){
        2. 연결된 점을 Queue에 넣기
        for( Node child : children){
            q.offer(child)
        }
    }
*/
public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();

        Solution.tree root = new Solution.tree("1");
        Solution.tree rootChild1 = root.addChildNode(new Solution.tree("2"));
        Solution.tree rootChild2 = root.addChildNode(new Solution.tree("3"));
        Solution.tree leaf1 = rootChild1.addChildNode(new Solution.tree("4"));
        Solution.tree leaf2 = rootChild1.addChildNode(new Solution.tree("5"));
        ArrayList<String> output = sol.bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new Solution.tree("6"));
        rootChild2.addChildNode(new Solution.tree("7"));
        output = sol.bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }
    public ArrayList<String> bfs(tree node) {
        ArrayList<String> answer = new ArrayList<>();

        Queue<tree> q = new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()) { // 3. 큐가 빌 때까지 반복한다.

            tree curNode = q.poll();    // 1. 가장 먼저 넣었던 것을 꺼낸다.
            answer.add(curNode.getValue());

            if (curNode.getChildrenNode() != null){
                for (tree child : curNode.getChildrenNode()){   // 2. 연결된 점을 Queue에 넣는다.
                    q.offer(child);
                }
            }
        }

        return answer;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
