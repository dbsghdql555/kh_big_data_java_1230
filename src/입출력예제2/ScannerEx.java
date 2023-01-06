package 입출력예제2;

import java.io.IOException;
import java.util.Scanner;// 두번째로 많이 사용하는 자바 API
//Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환받음

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner라는 클래스를 가지고와서 sc라는 변수를 사용함
        byte a = sc.nextByte(); //키보드의 입력을 byte형으로 반환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); //문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); //문자열을 공백 단위로 입력받음
        String s2 = sc.nextLine(); //문자열을 줄바꿈 기준으로 입력받음



    }
}
