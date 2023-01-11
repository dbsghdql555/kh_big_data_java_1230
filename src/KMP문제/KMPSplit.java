package KMP문제;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class KMPSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //첫번째 대문자 뽑아내기
//        for (int i=0; i<name.length(); i++) {
//            char ch = name.charAt(i);
//            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
//        }
        //두번째 split 사용
//        String[] splitName = name.split("-");
//        for (String e : splitName) System.out.print(e.charAt(0));

        char[] chName = name.toCharArray();
        for (char e : chName) {
            if (e>='A' && e<='Z') System.out.print(e);
        }


    }
}
