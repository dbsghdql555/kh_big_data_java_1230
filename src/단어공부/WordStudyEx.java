package 단어공부;

import java.util.Scanner;

public class WordStudyEx {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        int max = 0;
        char result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("단어입력 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for (int i =0; i < alphabet.length; i++) {
            if (alphabet[i] == max) result = '?';
            else if(alphabet[i] > max) {
                max = alphabet[i];
                result = (char) ('A' + i); // 배열의 인덱스에서 'A' 만큼의 값을 증가 시켜서 실제 대문자 ASCII 값을 구함
            }
        }
        System.out.println(result);
    }
}
