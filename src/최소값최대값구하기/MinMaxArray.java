package 최소값최대값구하기;

import jdk.jshell.Snippet;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

// 정수 값 입력
// 입력된 정부 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 3 5 7 2
public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        // 정수값 입력을 받음
        // 입력 받은 정수로 배열을 생성
        // 생성된 배열 크기만큼 순회 하면서 정수값을 입력 받음
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력
        Scanner sc = new Scanner(System.in);
        System.out.printf("배열 갯수 입력 : ");
        int number[] = new int[sc.nextInt()];

        for (int i = 0; i<number.length; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        int min = number[0];

        System.out.println(Arrays.toString(number));
        for (int e : number) {
            if (e > max) max = e;
            if (e < min) min = e;
        }
        System.out.printf("최댓값은 : " + max + "최소값은 : " + min);


    }
}
