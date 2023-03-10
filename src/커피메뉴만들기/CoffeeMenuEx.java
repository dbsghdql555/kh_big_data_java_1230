package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// [1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료
public class CoffeeMenuEx {

     Map<String ,MenuInfo> map = new TreeMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }

    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 1500, "Coffee", "기본 커피 입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4500, "Coffee", "우유가 포함된 커피 입니다."));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료 : ");
            int selMenu = sc.nextInt();
            String key = "";
            switch (selMenu) {
                case 1 :
                    System.out.println("======== 메뉴 보기 ========");
                    for (String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("-------------------------------");
                    }
                case 2 :
                    System.out.print("조회 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) { // map 내에 키가 존재하는지 확인 (있으면 true)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("-------------------------------");
                    }
                case 3 :
                    System.out.println("추가 할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    }else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                case 4 :
                    System.out.print("삭제할 메뉴를 입력 하세요. : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");

                    }else System.out.println("삭제할 메뉴가 없습니다.");
                    break;
                case 5 :
                    if (map.containsKey(key)) {
                        System.out.print("수정할 메뉴를 입력 하세요 : ");
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, group, desc));
                    }else System.out.println("수정할 메뉴가 없습니다.");
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    return;
            }
        }
    }
}
