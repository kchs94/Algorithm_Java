package 백준.단계별문제풀이.기본수학1.손익분기점_1712;
// 실패: 시간초과
import java.util.Scanner;

/*
* 문제: A=고정비용, B= 1대 만들 때마다 드는 비용, C=노트북판매가격
* 입력: 한 줄에 공백을 두고 자연수 A,B,C 입력됨 1<=A, B, C <= 21억
* 출력: 최초의 이익이 발생하는 판매량 출력. 손익분기점에 존재하지 않으면 -1 출력
* 알고리즘
* 1.A, B, C 가격 입력받기:in.nextLine(), int 사용
*
*
* */
public class 손익분기점_1712_1 {                // 손익분기점 총 수입 - 총 비용 > 0 이 되는 첫 시점
    public static void main(String[] args) {
        // 입력
        // 1000 70 170
        Scanner in = new Scanner(System.in);
        int fixedCost = in.nextInt();       // 고정비용
        int variableCost = in.nextInt();    // 가변비용
        int price = in.nextInt();           // 한 대 가격
        int count = 0;                      // 판매량
        int totalCost=0;      // 총 비용 = 고정비용(fixedCost) + (가변비용(variableCost) * 판매량)
        int totalIncome=0;                // 총 수입 = 판매갯수 * 한 대 가격
        int breakEvenPoint=0;
        int first=0;
        in.close();

        // 알고리즘
        while(breakEvenPoint<=0){    // 손익분기점이 양수일 때까지 반복
            count++;
            totalIncome = price * count;
            totalCost = fixedCost + (variableCost * count);
            breakEvenPoint = totalIncome - totalCost;
            if(count == 1)
                first = breakEvenPoint;
            if(count == 2 && breakEvenPoint < first){
                count = -1;
                break;
            }
        }
        
        // 출력
        System.out.println(count);
    }
}
