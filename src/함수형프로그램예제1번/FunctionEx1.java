package 함수형프로그램예제1번;
// 함수형 프로그램이란 : 자바8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문, 반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용됩니다. 생략 가능한 모든 것을 생략하는 것을 기본 원칙으로 합니다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 반드시 함수형 인터페이스가 필요 합니다.
@FunctionalInterface // 의미론적으로는 함수형 인터페이스를 만들기 위해 걸어줘야함, 함수형 인터페이스에는 메소드가 한개만 올 수 있음
interface  Calculator {
    int sum(int a, int b);
   // int sub(int a, int b); 오류 발생
}
@FunctionalInterface
interface MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}

@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); // 반환 타입이 있는 형식
}
class MyCalculator implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
public class FunctionEx1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int rst = mc.sum(3,4);
        System.out.println(rst);

        Calculator lc = (a, b) -> a+b;
        int rst1 = lc.sum(3,4);
        System.out.println(rst1);

        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        MyFuncInterface2 fi2 = (x,y) -> x < y? x : y;
        System.out.println(fi2.min(3,4));
    }
}
