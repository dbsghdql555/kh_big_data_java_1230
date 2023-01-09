package 대소문자변경;

import java.util.Arrays;
import java.util.Scanner;

// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로, 소문자는 대문자로 변경
// 무조건 입력은 영문자이다.
// AbCdEf => aBcDeF
// 힌트 1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스) 이다.
// 힌트 2 : 자바에서의 문자를 정수값을 사용된다.
// 힌트 3 : 정수값으로 계산 후 출력 시 (char)형 변환이 필요하다.
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

//        char[] arr = a.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            char ch = (a.charAt(i));
//            if (ch >= 'a' && ch <= 'z') {
//                arr[i] = Character.toUpperCase(ch);
//            }
//            else if(ch >= 'A' && ch <= 'Z') {
//                arr[i] = Character.toLowerCase(ch);
//            }
//
//        }
        for (int i = 0; i<a.length(); i++) {
            char ch = a.charAt(i);
            int n = 0;
            if (ch < 'a') {
                n = (('a' - 'A'));
                ch = (char) (n + ch);
            }
            else {
                n = ('A' - 'a');
                ch = (char) (n + ch);
            }
            System.out.print(ch);
        }
//        System.out.println(arr);

    }
}
