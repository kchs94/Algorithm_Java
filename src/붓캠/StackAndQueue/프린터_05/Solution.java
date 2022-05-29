package 붓캠.StackAndQueue.프린터_05;
import java.util.*;

public class Solution {
  public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
    // 대기목록을 저장할 큐를 하나 생성한다.
    Queue<Integer> q = new LinkedList<>();
    // document의 맨 처음의 값을 q에 넣어준다.
    for (int i=0; i<bufferSize-1; i++) {
      q.add(0);
    }
    int qCounter = documents[0];
    q.add(documents[0]);

    documents = Arrays.copyOfRange(documents, 1, documents.length);
    // int secondCounter = 1;
    int secondCounter = 1;
    // while(documents.length == 0 && q.size() == 0일때 탈출) {
    // secondCounter++;
    // if(q안에 있는 갯수만큼 q.get() + documents의 첫번째 값을 더한 것 > capacities) // 못 들어온는 경우
    //   if: q에 0값이 존재한다면 q.poll()을 하고 뒤에 것을 한칸씩 앞당긴다.
    //   else: 뒤에것을 한칸씩 앞당긴다.
    // else { // 다음 값이 들어올 수 있는 경우
    //   if: q에 맨값이 존재하면, q.poll()하고 뒤에 것을 한칸식 앞당긴다. 새로운 값을 마지막에 넣는다.
    //   else: q에 맨값이 존재하지 않으면, 뒤에 것을 한칸식 앞당긴다. 새로운 값을 마지막에 넣는다.
    // }

    while(documents.length != 0 || q.size() != 0) {
      secondCounter++;
      if (documents.length > 0)
        qCounter += documents[0];
      if(qCounter > capacities) {
        if(q.peek() != 0)
          qCounter -= q.peek();
        q.poll();
        q.add(0);
        if (documents.length > 0)
          qCounter -= documents[0];
      }
      // 다음에 값이 들어올 수 있으면
      else {
        if(q.peek() != 0)
          qCounter -= q.peek();
        q.poll();
        if (documents.length > 0) {
          q.add(documents[0]);
          documents = Arrays.copyOfRange(documents, 1, documents.length);
        }
      }
    }
    // return secondCounter;
    return secondCounter;
  }

  public static void main(String[] args) {
    System.out.println(queuePrinter(2,10,new int[]{7, 4, 5, 6}));
  }
}