package 붓캠.StackAndQueue.박스포장_04;
import java.util.*;

public class Solution {
  public static int paveBox(Integer[] boxes) {
    // 박스 배열을 순회합니다.
    // if 자기자신보다 뒤에 있는 요소의 값들이 작거나 같으면 count++
    // 그외에 큰 값이 오면 count를 max로 옮기고 count를 1로 초기화합니다.
    Queue<Integer> q = new LinkedList<>();
    for (Integer box : boxes) {
      q.add(box);
    }
    int maxCount = 1;
    int count = 1;
    int presentBox = q.poll();
    for (int i=1; i<boxes.length; i++) {
      int otherBox = q.poll();
      if (presentBox < otherBox ) {
        maxCount = Math.max(maxCount, count);
        presentBox = otherBox;
        count = 1;
        continue;
      }

      if (i == boxes.length-1) {
        count++;
        maxCount = Math.max(maxCount, count);
      }
      count++;
    }
    return maxCount;
  }

  public static void main(String[] args) {
    System.out.println(paveBox(new Integer[]{1}));
  }
}
