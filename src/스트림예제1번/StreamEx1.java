package 스트림예제1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림이란? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
// - 자료의 대상과 상관 없이 동일한 연산 수행
// - 내부 반복자 이용(반복문 배제)
// - 스트림은 한번 생생된 후 최종 연산을 통해 소모되면 재사용 안됨
// - 원본 데이터 변경하지 않음
// - 지연 연산 지원, 병렬 처리 지원
// 스트림은 생성 -> 중개 연산 -> 최종 연산 순서로 진행 됩니다.
// 스트림은 스트림메소드를 상속받아서 사용함
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성, 중간 연산, 최종 연산
        // 중간 연산 생략 가능
        // 중간연산자는 여러개 올 수 있으나, 최종 연산은 한개밖에 오지 못함
        list.stream().filter(s->s.intValue() >= 5).forEach(System.out::println);
        // stream 내부에 있으므로 내부 반복자, 스트림을 생성하고 filter 로 중간연산을 해 값을 걸러낸 다음 최종연산엔 걸러낸 값을 프린트해 찍는다.

        int sum = list.stream().mapToInt(e->e).sum();// mapToInt(중간연산, int 스트림을 구성), sum(최종연산)
        // map : 기존에 있는 값을 꺼내와 새로운 스트림을 만들어내는 것

        int count = (int)list.stream().count(); // count()의 반환 타입은 long 이므로 변환 필요
        // count() 는 최종연산자이므로 뒤에 최종연산자인 foreach()를 붙일 수 없음, 따라서 따로 프린트문을 찍어줘야 함
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);

    }
}
