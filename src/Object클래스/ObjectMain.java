package Object클래스;
// Object 클래스 : 모든 클래스의 조상이 되는 최상위 클래스 (항상 존재하지만 숨어 있음)
// toString() : 해당 객체 (인스턴스)에 대한 정보를 문자열로 반환하는 것 (클래스정보@해시코드)
// 정보에 표시되는 해시코드는 객체의 메모리 주소를 이용해 해시코드 생성 (해시코드로 동일한 객체인지 비교할 수 있음)
// 객체 안에 있는 값으로 비교하는 것보다 객체를 하나의 주소값으로 지정해 비교하는 것이 더 효율적임
// Hash function 에 객체의 주소를 넣으면 하나의 값을 도출, 객체의 주소에 .이라도 다른 값이 찍히면 전혀 다른 해쉬코드 생성
// 이상적으로는 해쉬코드를 사용해 O(1)을 달성할 수 있으나 메모리 저장공간이 무한대가 아니므로 실질적으로 불가능
// 따라서 메모리 공간에 여러개의 해시코드를 저장해 찾아내는 방법 사용
// equals() : 해당 객체와 매개변수로 전달 받은 객체를 비교하여 결과 (참조가 같은지?) (해시코드 비교)

public class ObjectMain extends Object{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student2)); //false
        student1 = student2;
        System.out.println(student1.equals(student2)); //true

    }
}

class Student extends Object {
    int id;
    String name;

}