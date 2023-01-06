package 반복문forEX1;
// 양의 정수를 받아서 n * n 크기의 행렬을 출력하는 프로그램 작성
// 값은 1부터 시작
// 정수 값 : 3
// 1 2 3
// 4 5 6
// 7 8 9

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n*n; i++ ) {
            System.out.printf("%3d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
