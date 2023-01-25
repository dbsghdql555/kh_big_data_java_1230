package 암호체크;

import java.util.ArrayList;
import java.util.Scanner;

// 암호체크
// 암호의 길이는 10~ 30자 사이 ( 10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중의 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password" 출력
// 반복문을 사용하고 사용가자 "종료" 도는 "exit"를 입력하면 프로그램 종료
public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{'!', '%', '_', '#', '&', '+', '-', '*', '/'};
        int bo[] = new int[4];
        boolean GB = true;
        while (true) {
            String password = sc.next();
            char ch [] = new char[password.length()];
            if (password.equals("exit")||password.equals("종료")) break;
            for (int i = 0; i<password.length(); i++) {
                ch[i] = password.charAt(i);
            }
            for (int i = 0; i < password.length(); i++) {
                char tok = ch[i];
                if (password.length()>=10 && password.length()<=30) bo[0] = 1;
                if ('0' <= tok && tok <= '9') bo[1] = 1;
                if ('a' <= tok && tok <= 'z') bo[2] = 1;
                if ('A' <= tok && tok <= 'Z') bo[3] = 1;
            }
            for (int i = 0; i < 4; i++){
                if (bo[i] != 1) GB = false;
            }
            if (GB == true) {
                System.out.println("Good password");
            }
            else  System.out.println("Bad password");
            GB = true;
            for (int i = 0; i<4; i++) {
                bo[i] = 0;
            }
            System.out.println(password);



        }



    }
}
