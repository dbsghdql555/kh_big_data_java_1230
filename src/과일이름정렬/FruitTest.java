package 과일이름정렬;
// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전(알파벳 순서)을 정렬하기
// String length()
// String compareTo() 사용하면 해결 할 수 있음
// Arrays.sort(배열이름, new Comparator<String>() { compare() 메소드 구현}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        String [] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon", "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { //compare : 두 수를 비교해 양수면 자리를 바꾸고 음수면 현상태 유지
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길이가 길면 정렬 조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));



    }
}
