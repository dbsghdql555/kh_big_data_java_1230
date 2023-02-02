package 숫자의합;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 7000000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 입력 : 0000
// 프로그램 종료
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("입력 : ");
            String numSt = sc.nextLine();
            if (numSt.equals("0000")) break;
            for (int i = 0; i < numSt.length(); i++) {
                sum += ((int) numSt.charAt(i) - 48);
            }

            System.out.print("출력 : ");
            System.out.println(sum);
            sum = 0;


        }

    }

}
