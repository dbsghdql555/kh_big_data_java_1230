package 소수단어;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = 0;
        int newNum = 0;
        for (int i = 0; i<word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                num = (int)word.charAt(i)-32;
            }
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                num = (int)word.charAt(i)-96;
            }
            System.out.println(num);
            newNum+=num;
        }
        if (newNum % 2 == 0) System.out.println("It is prime word.");
        else System.out.println("It is not a prime word.");
    }

}
