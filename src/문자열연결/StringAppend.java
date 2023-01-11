package 문자열연결;

import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// ulkorea
// 3이라고 입력했다면
// oulkorea
// 힌트 1. substring(index) : 문자열의 시작 위치 부터 끝까지 잘라냄
// 힌트 2. substring 메소드릴 이용해 문자열 추출하기 전에 index 계산이 필요함
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int num = sc.nextInt();
        int num2 = str1.length()-num;
        System.out.print(str1.substring(num2)+str2);


    }
}
