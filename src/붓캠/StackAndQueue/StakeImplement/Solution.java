package 붓캠.StackAndQueue.StakeImplement;

import java.util.ArrayList;

public class Solution {
  private ArrayList<Integer> listStack = new ArrayList<Integer>();

  // 단순히 데이터를 추가하면 된다.
  public void push(Integer data) {
    listStack.add(data);
  }

  // 먼저 스택에 데이터가 있는지 확인한다.
  // 만약 없다면 null을 반환한다.
  // 있다면 그 값을 삭제하고 그 값을 반환한다.
  public Integer pop() {
    if(listStack.isEmpty()) {
      return null;
    }else {
      return listStack.remove(listStack.size()-1);
    }
  }

  public int size() {
    return listStack.size();
  }

  public Integer peek() {
    if(listStack.isEmpty()) {
      return null;
    }else {
      return listStack.get(listStack.size()-1);
    }
  }

  public String show() {
    return listStack.toString();
  }
  public void clear() { listStack.clear(); }

  public static void main(String[] args) {
    Solution stack = new Solution();
    System.out.println(stack.size());
    System.out.println(stack.pop());
    System.out.println(stack.peek());

    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.size());
    System.out.println(stack.show());
  }
}
