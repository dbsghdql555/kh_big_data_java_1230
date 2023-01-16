package 오버라이딩제약;

public class Vehicle {
    protected int speed; // 상속으로 privated를 걸면 필드 내 변수가 상속되지 않음 그러나 protected를 걸면 상속 가능
    protected String color; // protected(상속 관계와 동일패키지내에서 접근 가능)
    protected String name;
    final void accelerator() {
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}
class SportsCar extends Vehicle {
    private boolean isTurbo;

    SportsCar(String name) {
        isTurbo = false;
        speed = 280; // Vehicle로부터 상속 받음
        this.name = name; //생성자로부터 이름을 입력받아 인스턴스 필드의 초기값으로 사용
        color = "Red";
    }

    int getSpeed() {// 게터라고 부른다.
        if (isTurbo) return speed *= 1.2;
        return speed;
    }

    boolean getTurbo() { // 게터
        return isTurbo;
    }

    void setTurbo(boolean turbo) {//세터는 외부에서 내부에 있는 필드 값을 변경
        isTurbo = turbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}
    class ElectricCar extends Vehicle {
        boolean isAutoDrv;
        ElectricCar(String name) {
            isAutoDrv = false;
            speed = 200;
            this.name = name;
            color = "White";
        }
        boolean getAutoDrv() {
            return isAutoDrv;
        }
        void setAutoDrv(boolean autoDrv) {
            isAutoDrv = autoDrv;
        }
        void infoCar() {
            System.out.println("이름 : " + name);
            System.out.println(("속도 : " + speed));
            System.out.println("색상 : " + color);
            System.out.println("자율주행 : " + isAutoDrv);
        }
    }

