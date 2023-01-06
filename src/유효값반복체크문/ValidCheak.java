package 유효값반복체크문;
//반복문을 이용해서 유효값 체크 하기 (while 반복문 사용)
//do ~ while() : 먼저수행 후 조건 확인
import java.util.Scanner;

public class ValidCheak {
    public static void main(String[] args) {
        int age;
        boolean isFirst = true;
        Scanner sc = new Scanner(System.in);
        do {
            if(!isFirst) System.out.println("나이를 잘 못입력하였습니다.");
            System.out.println("나이를 입력 하세요 : ");
            age = sc.nextInt();
            isFirst = false;
        } while (age <= 0 || age >= 200);
        System.out.println("입력하신 나이는" + age +"입니다.");


    }
}
