package 백준.단계별문제풀이.정렬.나이순정렬_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
* 1.회원 수 N을 입력받는다.(1<= N <= 100,000)
* 2-1.둘째 줄 부터 N번 나이와 이름을 공백으로 구분해서 입력받는다.(1<= 나이 <= 200, 이름은 알파벳 대소문자로 이루어져 있고, 길이는 100이하인 문자열)
* 2-2.참고로 입력은 가입한 순서로 주어진다.
* 3.회원들을 나이가 증가하는 순으로 정렬한다.
* 4.나이가 같다면 먼저 가입한 사람이 앞에 오는 순서로 정렬한다.
* 5.정렬된 회원 목록을 한 줄에 나이와 이름을 공백으로 분리하여 출력한다.
*
* 나이와 이름이 자료형이 다른데 어떻게 같이 저장할까? --> 클래스를 만들자.
* */


public class 나이순정렬_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Person[] arr = new Person[N];

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i]= new Person(age, name);
        }

        Arrays.sort(arr, new Comparator<Person>() {
            // 나이순으로 정렬합니다.
           @Override
           public int compare(Person p1, Person p2){
                return p1.age - p2.age;
           }
        });

        StringBuilder sb = new StringBuilder();
        for(Person person : arr){
            sb.append(person);
        }
        System.out.println(sb);
    }
}

class Person {
    int age;    // 접근 지정자를 작성 안하면 default 접근 지장가 설정되고 같은 패키지 안에서 직접 접근가능하다.
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return age + " " + name + "\n";
    }
}