package 기본프로그램; //접근제한자(캡슐화)와 연관성이 있음
//접근제한자 : public, protected, default, private
public class Sample { //클래스 이름을 지정, public은 하나만 가능 또한 이름 동일해야함
    // main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출함
    // void는 메소드 실행 이후의 반환타입 중 하나
    public static void main(String[] args) { // main의 시작과 끝은 프로그램의 시작과 끝 main을 치고 탭을 누르면 자동생성됨
        System.out.println("Hello, Java");

    }
}

