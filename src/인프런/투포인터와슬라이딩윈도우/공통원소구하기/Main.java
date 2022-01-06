package 인프런.투포인터와슬라이딩윈도우.공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index1 = 0;
        int index2 = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (index1 < n1 && index2 < n2) {

            if (arr1[index1] == arr2[index2]) {
                list.add(arr1[index1]);
                index1++;
                index2++;
            }
            else if (arr1[index1] < arr2[index2]) {
                index1++;
            }
            else if (arr1[index1] > arr2[index2]) {
                index2++;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) {
            arr2[i] = in.nextInt();
        }
        for (int i : T.solution(n1, arr1, n2, arr2)) {
            System.out.print(i + " ");
        }
    }
}
