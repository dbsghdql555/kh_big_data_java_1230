package 연산자연습1;

import java.util.Scanner;

//산술연산자 : +, -, *, /, %(나머지)
//이항연산자와 삼항연산자
//대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
//복합대입연산자 : 연산 후 대입
//증감연산자 : 값을 1증가하거나 감소시키는 연산자(단항연산자), ++, --
//우위와 전위에 따라 상황이 달라짐
//비교 연산자 : 값의 크기를 비교하는 연산자
//논리 연산자 : 참과 거짓을 판단하는 것? AND(&&) OR(||) NOT(!)
//문자열 결합연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args) {
//        int num1 = 10, num2 = 4;
//        System.out.println("+ 연산자 : "  + (num1+num2));
//        System.out.println("- 연산자 : "  + (num1-num2));
//        System.out.println("* 연산자 : "  + (num1*num2));
//        System.out.println("/ 연산자 : " + ((double)num1/num2));
//        System.out.println("% 연산자 : " + (num1%num2));
//
//        try {
//            System.out.println(num1 /num2);
//        } catch (ArithmeticException e) {//예외 처리
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }

        int num1 = 10, x = 10, y = 20;
//        System.out.println(num1 += 2);
//        System.out.println(num1 -= 2);
//        System.out.println(num1 *= 2);
//        System.out.println(num1 /= 2);
//        System.out.println(num1 %= 2);
//        System.out.println(++num1);
//        System.out.println(num1);
//        System.out.println(x > y);
//        System.out.println(x < y);
//        System.out.println(x == y);
//        System.out.println(x >= y);
//        System.out.println(x <= y);
        boolean rst1, rst2, rst3;
        rst1 = (x > y) && (x > 5); //거짓
        rst2 = (x > y) || (x > 5); //참
        rst3 = !(x > y) || (x > 5); //거짓
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//
//        System.out.println(isAdult);
        System.out.println("Java" + (11.03 + 12));



    }
}
