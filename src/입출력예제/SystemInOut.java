package 입출력예제;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 안산시";
        char gender = '여';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double aver = 0.0;
        //자바 스타일 (메소드를 오버로딩하는 방식)
        System.out.println("==========Java Style Output==========");
        System.out.print("Name : " + name + "\n");
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat)/3);
        System.out.println("평균 " + (double)(kor + eng +mat)/3);
        //c언어 스타일(서식지정자를 사용)
        //서식지정자 : %d, %ld, %u, %f, %.2f, %s, %c, %%, %b
        //이스케이프시퀀스 : \n(줄바꿈), \r(CR),\t(탭), \b(백스페이스), \\
        System.out.printf("==========Java Style Output==========");

        System.out.printf("이름 : %s\n", name); //name을 ""안에 넣어서 찍어라
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3);
        System.out.printf("이름 : %s, 주소 : %s\n", name, addr); //한번에 두개 출력
        System.out.printf("Apple\tBanana\tKiwi\b\b\n");
        System.out.printf("\"Enter\"키를 입력하시면 종료됩니다.");
        System.out.printf("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i <= n * n; i++) {
            System.out.printf("%3d", i); //공간 비우기
            if(i % n == 0) System.out.println();
        }

    }
}
