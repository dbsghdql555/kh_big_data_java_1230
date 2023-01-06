package 반복문연습문제2;

import javax.swing.*;
import java.util.Scanner;

//입력을 5라고 입력받으면
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("* ");
            }

        }
        System.out.println();
    }

}
