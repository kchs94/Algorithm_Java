package 인프런.스택과큐.응급실.방법1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {

    int solution(int n, int m, int[] arr) {
        int answer=0;
        Queue<Person> q = new LinkedList<>();
        for (int i=0; i<n; i++) {   // 큐 설정
            q.offer(new Person(i, arr[i]));
        }

        int count = 0;
        while(!q.isEmpty()) {
            Person temp = q.poll(); // 하나 꺼내서
            for (Person x : q) {    // 큐 안에 남아있는 사람들 순회
                if (x.priority > temp.priority) {
                    q.offer(temp);  // 진료받으면 안되니깐 넣어준다.
                    temp = null;
                    break;  // 더 비교할 필요가 없으니깐
                }
            }
            if (temp != null) { // 우선순위가 높은 사람이 없었으니깐 진료받아도 된다.
                answer++;
                if (temp.id == m)
                    return answer;
            }
        }
        return answer;  // 여기로 올 일은 없다. 즉 컴파일 에러 방지를 위해 작성한다.
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
