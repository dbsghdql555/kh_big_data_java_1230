package 스트림예제5번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
// 7개의 정수를 입력 받아 홀수 짝수 나누어 담기
public class StreamEx5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[7];
//        for (int i = 0; i<7; i++) arr[i] = sc.nextInt();

//        IntStream stream = Arrays.stream(arr);
//        stream.filter(n->n%2 != 0).forEach(a->System.out.print(a + " "));
//        System.out.println();


        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
        // 스트림에서 홀수 값만 골라냄
//        stream2.filter(n->n % 2 != 0).forEach(System.out::println);
        // 스트림에서 중복 요소를 제거
//        stream2.distinct().forEach(e-> System.out.print(e + " "));
        // 스트림 변환 : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream3.map(s->s.length()).forEach(System.out::println);

        Stream<String> stream4 = Stream.of("I study jard", "You study JAVA", "I am hungry");
        stream4.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫번째 요소부터 전달된 개수 만큼의 요소로만 이루어진 새로운 스트림 반환
        // skip() :  해당 스트림의 첫번째 요소부터 전달된 개수 만큼의 요소를 제외하고 출력
        IntStream stream5 = IntStream.range(0,10);// 0 ~ 10미만까지 범위지정
        IntStream stream6= IntStream.range(0,10);
        IntStream stream7= IntStream.range(0,10);
        stream5.limit(5).forEach (n-> System.out.println(n + " ")); // 처음부터 5번째 까지
        System.out.println();
        stream6.skip(5).forEach (n-> System.out.println(n + " ")); // 0~4번째까지 스킵 후 이후 반환
        System.out.println();
        stream7.skip(3).forEach (n-> System.out.println(n + " ")); // 0~2번깨까지 스킵 후 이후 반환

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s + " "));

    }
}
