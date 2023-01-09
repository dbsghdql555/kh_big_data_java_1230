package 상근날드;

import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3개 종류가 있고 (
// 음료 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3가지 음료 2가지를 연속 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 가장 싼 것 선택하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액을 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu[] = new int[5];

        System.out.printf("메뉴 입력 : ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int burger = menu[0];
        int drink = menu[3];
        for (int i = 0; i < menu.length; i++) {
            if ((i < 3) && (burger > menu[i])) burger = menu[i];
            if ((i > 2) && (drink > menu[i])) drink = menu[i];
        }
        System.out.println(burger+drink-50);
    }

}
