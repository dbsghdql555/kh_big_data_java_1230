package 제네릭연습;
//제네릭 타입 : 타입 변수를 사용해 다형성 구현
public class GenericTextEx2 {
    public static void main(String[] args) {
        Person1<String > p1 = new Person1<>("곰돌이사육사");
        Person1<Integer> p2 = new Person1<>(1004); //Integer 은 Int 와 달리 가르키고 있는 주소형임
        System.out.println(p1.info+p2.info);


    }
}
// 'T' 타입 변수라고 하며, 임의의 참조형 타입을 의미, 'T' 변수명을 의미하며 아무이름으로 지어도 됨(일반적으로 대문자 T)
class Person1 <T>{
    public T info;
    Person1(T info) {
        this.info = info;

    }
}
