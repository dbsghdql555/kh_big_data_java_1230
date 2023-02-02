package 배수찾기;
// 문제 : 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어있는 수가 주어짐 (0~10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 출력
// 1 is NOT a multiple of 3.
// 7 is NOT a multiple of 3.
// 99 is a multiple of 3.
// 321 is a multiple of 3.
// 777 is a multiple of 3.
public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int search;
        while (true){
            search = sc.nextInt();
            arr.add(search); // ArrayList 에 들어가는 것은 객체므로 원래는 arr.add(new Integer(search)); 가 맞음
            // 자바에서는 자동으로 박싱을 지원해주므로 arr.add(search) 가 가능해짐 int -> Integer
            // add 에 인덱스를 지정하지 않으면 마지막 위치에 저장됨
            if (search == 0) break;
        }
        for (Integer  e : arr) {
            if (e%num == 0) System.out.println(e+" is a multiple of " + num + ".");
            else System.out.println(e + " is NOT a multiple of " + num + ".");
        }

    }
}
