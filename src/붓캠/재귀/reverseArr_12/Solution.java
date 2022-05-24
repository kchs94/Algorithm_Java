package 붓캠.재귀.reverseArr_12;
import java.util.*;

public class Solution {
  public int[] reverseArr(int[] arr){
    if(arr.length == 0) return new int[]{};
    int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
    int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

    int[] dest = new int[head.length + tail.length];
    System.arraycopy(head, 0, dest, 0, head.length);
    System.arraycopy(tail, 0, dest, head.length, tail.length);
    return dest;
  }
}
