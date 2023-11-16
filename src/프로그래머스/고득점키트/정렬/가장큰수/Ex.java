package 프로그래머스.고득점키트.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Ex {
    public String solution(int[] numbers) {

        String[] arr = new String[numbers.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return (o1+o2).compareTo(o2+o1)*-1;
            }
        });

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
