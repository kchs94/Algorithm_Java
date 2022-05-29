package 붓캠.StackAndQueue.QuueImplement;
import java.util.*;
/*
* 큐에 필요한 메소드
* public void add(Integer o): 입력으로 들어온 값을 큐에 저장합니다.
* public Integer poll(): 가장 먼저 추가된 데이터를 삭제하고 삭제한 데이터를 리턴합니다.
* public Integer size(): 큐에 있는 데이터의 갯수를 리턴합니다.
* public Integer peek(): 큐에 가장 먼저 추가된 데이터를 삭제하지 않고 조회만 합니다.
* public String show(): 큐에 있는 모든 데이터를 String으로 변환하여 리턴합니다.
* public void Clear(): 큐에 있는 모든 데이터를 삭제합니다.
* */
public class Solution {
  private ArrayList<Integer> listQueue = new ArrayList<Integer>();

  public void add(Integer data) {
    listQueue.add(data);
  }

  public Integer pull() {
    if(listQueue.isEmpty()) {
      return null;
    }else {
      return listQueue.remove(0);
    }
  }

  public int size() {
    return listQueue.size();
  }

  public Integer peek() {
    if(listQueue.isEmpty()) {
      return null;
    }else {
      return listQueue.get(0);
    }
  }

  public String show() {
    return listQueue.toString();
  }

  public void clear() {
    listQueue.clear();
  }

  public static void main(String[] args) {
    Solution queue = new Solution();


    queue.add(1);
    queue.add(2);
    queue.add(3);
    System.out.println(queue.size());
    System.out.println(queue.pull());
    System.out.println(queue.show());
    System.out.println(queue.peek());
    queue.clear();
    System.out.println(queue.peek());
    System.out.println(queue.size());
    System.out.println(queue.pull());
  }
}

