package 백준.스택;

/*
*
*
* */

import java.util.Scanner;

class IntStack{
    private int max;        // 스택 용량
    private int ptr;        // 스택 포인터
    private int[] stk;      // 스택 본체

    public IntStack(int capacity){
        max = capacity;
        stk = new int[max];
        ptr=0;
    }

    public void push(int x){
        if(ptr <= max)
            stk[ptr++] = x;
    }

    public int pop(){
        if(ptr <= 0)
            return -1;
        else
            return stk[--ptr];
    }

    public int size(){
        return ptr;
    }

    public int empty(){
        if(ptr <= 0)
            return 1;
        else
            return 0;
    }

    public int top(){
        if(ptr <= 0)
            return -1;
        else
            return stk[ptr-1];
    }
}

public class 스택_10828 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N  = in.nextInt();  // 명령 수
        IntStack s = new IntStack(10000);
        StringBuilder sb = new StringBuilder();


        for(int i=0; i<N; i++){
            String str = in.next();

            switch(str){
                case "push":
                    int x = in.nextInt();
                    s.push(x);
                    break;
                case "pop":
                    sb.append(s.pop() + "\n");
                    break;
                case "size":
                    sb.append(s.size() + "\n");
                    break;
                case "empty":
                    sb.append(s.empty() + "\n");
                    break;
                case "top":
                    sb.append(s.top() + "\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
