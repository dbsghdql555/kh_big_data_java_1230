package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("1234567", "곰돌이사육사", "sphb8250", 30, true);
        //Member mem2 = mem1; // stack 의 mem1참조변수가 Heap 의 객체(("1234567", "곰돌이사육사"...)를 바라볼 때 mem2에 mem1의 주소를 넘겨 같은 값이 출력됨(얕은 복사)
        //따라서 주소 값이 같기 때문에 하나의 값을 변경하면 같이 변경됨
        Member mem2 = mem1.getMember(); // 깊은 복사

        mem2.age = 300;
        mem2.name = "Tiger";

        System.out.println("name : "  + mem1.name);
        System.out.println("age : " + mem1.age);
        System.out.println("name : "  + mem2.name);
        System.out.println("age : " + mem2.age);
    }
}
