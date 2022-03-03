package 백준.단계별문제풀이.일차원배열;

import java.util.ArrayList;
import java.util.Scanner;

//Sol:1.배열에 10개 입력을 받고 같은 배열에 바로 나머지를 저장한다.
//2. ArrayList<int>를 이용하여 중복을 제거한 값만 넣는다.
//3. ArrayList의 크기를 반환한다.
public class 나머지_3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        ArrayList<Integer> diffNum = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
            arr[i] = arr[i] % 42;
            if(!diffNum.contains(arr[i])) // diffNum이 arr[i] 값을 갖고 있으면 true, 없으면 false
                diffNum.add(arr[i]);    // 없으면 추가 해준다.
        }

        in.close();
        System.out.println(diffNum.size()); // size(): diffNum 요소의 갯수를 반환

    }
}
