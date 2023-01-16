package 상속기본;

public class Animal {
    String name;

    void setName(String name) {
        this.name = name;

    }
}

// 상속을 받기 위해서는 extends
// Animal class로부터 상속을 받아 Dog class를 생성
// Dog class에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어 있음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override // 어노테이션
    void sleep() {
        System.out.println(name + "집에서 잠을 잡니다.");
        // Dog에서 sleep을 상속 받았지만 똑같은 sleep 이름으로
        // 메소드를 만들게 된다면 오버라이딩(재정의)가 성립한다.
    }
    void sleep(int time) {
        System.out.println(name + "가 " + time + "동안 " + "집에서 잠을 잡니다.");
    }
}
