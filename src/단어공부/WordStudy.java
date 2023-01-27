package 단어공부;

import java.util.ArrayList;
import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고 결과는 대소문자 구분 하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우는 ?로 출력
// 결과 예시 : AaAbcdd => A
public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ch1;
        String ch2;
        int max = 0;
        ArrayList<String> arr = new ArrayList<>();
        int[] arr1 = new int[str.length()];
        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j < str.length(); j++) {
                ch1 = String.valueOf(str.charAt(i));
                ch2 = String.valueOf(str.charAt(j));
                if (ch1.equalsIgnoreCase(ch2)){
                    arr1[i]++;
                }
            }
        }
        for(int i = 0; i<arr1.length ; i++) {
            if(arr1[i]>max) {
                max = arr1[i];

            }
        }
        System.out.println(str.charAt(max));

    }
}
