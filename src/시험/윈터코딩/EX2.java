package 시험.윈터코딩;

import java.util.ArrayList;

/*
 * 학급 내 학생의 총 수 n, 득점을 기록한 학생의 번호를 나열한 배열 student, 해당 득점 기록의 점수를
 * 나열한 배열 point가 매개변수로 주어질 때, 우열반의 편성이 변경되는 횟수를 return 하세요.
 *
 *
 * 열반의 학생이 득점을 했고 득점이 우반 학생들 중 가장 득점이 낮은 학생보다 득점이 높으면 편성이 변경된다.
 *   우반 학생들 중 가장 득점이 낮은 학생이 열반으로 가게 되고
 *       열반으로 가게된 학생을 넣고 그다음에 득점 순으로 정렬한다.
 *          만약 득점이 같다면 학생 번호를 기준으로 정렬한다.
 *
 *   득점한 학생을 우반에 넣고 그다음에 득점 순으로 정렬한다.
 *       만약 득점이 같다면 학생 번호를 기준으로 정렬한다.
 * 원래 우반에 있던 학생이 득점을 하면 편성 변경이 이뤄지지 않는다.
 *
 * */
public class EX2 {
    public int solution(int n, int[] student, int[] point) {
        int answer = 0;
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {  //1 2 3 4 5 6
            list.add(new Student(i, 0));
        }

        for (int i = 0; i < student.length; i++) {
            int getId = student[i];
            int getPoint = point[i];

            // 학생 점수 업데이트
            //학생 찾기
            // 점수 넣어주기
            int index = 0;
            for (Student findStudent : list) {
                if (findStudent.id == getId) {
                    break;
                }
                index++;
            }
            Student findStudent = list.get(index);
            

        }
        return answer;
    }

    public static void main(String[] args) {
        EX2 sol = new EX2();
        sol.solution(4, new int[]{1,2,3,4}, new int[]{1,2,3,4});
    }
}

class Student implements Comparable<Student> {
    int id;
    int point;

    public Student(int id, int point) {
        this.id = id;
        this.point = point;
    }

    @Override
    public int compareTo(Student o) {
        if (this.point == o.point)
            return this.id - o.id;

        return (this.point - o.point) * -1;
    }
}
