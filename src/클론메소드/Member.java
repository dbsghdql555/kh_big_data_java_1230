package 클론메소드;
// Cloneable : 실제 구현해야할 메소드는 없지만 인터페이스를 등록 후 사용, 단지 clone() 메소드 사용 가능하도록 권한(?)을 부여하는 의미
// Clone 을 사용하려면 Cloneable 을 써야함
public class Member implements Cloneable { // 복제 허용
    String id;
    String name;
    String pwd;
    int age;
    boolean isAdult;

    public Member(String id, String name, String pwd, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember() {
        Member cloned = null; // 클론에 null 처리
        try {
            cloned = (Member) clone(); // 객체를 만들고 cloned 에 주소를 넘김
            // clone 은 Object 타입임, 따라서 Member 로 타입을 변경함, super.을 쓰기도 함
        } catch (CloneNotSupportedException e ){} // Cloneable 이 아닌 것에 예외처리
        return cloned;
    }
}
