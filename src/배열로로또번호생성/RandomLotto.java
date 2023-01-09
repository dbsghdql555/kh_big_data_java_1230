package 배열로로또번호생성;

import java.lang.reflect.Array;
import java.util.Arrays;

//1~45 사이의 임의의 수 6개로 구성
//1. 배열로 로또 번호를 생성해 출력 하기
//2. 배열로 로또 번호 생성(중복 제거)
//3. 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
//
public class RandomLotto {
    public static void main(String[] args) {
        // 정수형 배열 생성, 갯수는 6개(로또 번호 저장을 위한 공간)
        // 반복문(6회)을 만들어 순회하면서 1~45 사이의 임의의 숫자를 배열에 대입
        // v = (int) ((Math.random() * 45) + 1
        // 배열의 요소를 출력
        int number[] = new int[6];
        int tmp; //생성된 로또 번호를 배열에 넣기전에 임시로 저장
        boolean isExist = false; //번호의 중복 여부 확인
        int index = 0;
        while (true) {
            tmp = (int)((Math.random() * 45) + 1);
            for (int i = 0; i < number.length; i++) {
                if (number[i] == tmp) isExist = true; //배열에 생성된 로또 번호가 있으면 true
            }
            // 생성된 번호가 배열내에 없으면 저장하는데, 인덱스 계산 해줘야 함
            if (isExist == false) number[index++] = tmp;
            // 로또번호가 5개 만들어 졌으면 반복문 탈출
            if(index == number.length) break;
            // 존재 여부 확인하는 변수를 초기화 시킴
            isExist = false; // false로 바꾸지 않으면 중복된 값이 나올 때 그 다음부턴 값이 들어가지 않음
        }
        System.out.println(Arrays.toString(number));



        // 로또번호 생성기(중복포함)
//        for (int i = 0; i <number.length; i++) {
//            number[i] = (int) ((Math.random() * 45) + 1);
//        }
//        for (int i = 0; i < number.length; i++) {
//            System.out.printf(number[i] + ", ");
//        }
//        System.out.print("\b\b");

    }
}
