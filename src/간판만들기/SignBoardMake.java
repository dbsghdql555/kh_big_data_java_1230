package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 1칸의 여팩이 필요
// 총 입력한 숫자를 표기하기 위해 몇칸의 공간이 필요한지 계산하는 문제
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = null;
        int result = 1;
        while (true) {
            number = sc.next();
            if (number.equals("0")) break;
            for (int i = 0; i < number.length(); i++) {
                String a = number.substring(i,i+1);
                if (number.equals(1)) result += 3;
                else if (number.equals(0)) result += 5;
                else result += 4;
            }
            System.out.print(result+1);
        }



        }

//            int[] numSize = {4,2,3,3,3,3,3,3,3,3};
//            int sum = 0;
//            Scanner sc = new Scanner(System.in);
//            while(true) {
//                String num = sc.nextLine();
//                if (num.equals("0")) break;
//                for (int i = 0; i < num.length(); i++) {
//                    sum += numSize[num.charAt(i) - '0'] + 1;
//                }
//                System.out.println(sum + 1);
//                sum = 0;
//            }
//        }
    }

