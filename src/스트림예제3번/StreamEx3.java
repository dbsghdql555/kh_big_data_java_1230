package 스트림예제3번;

import 스트림예제1번.StreamEx1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로부터 스트림 만들기
public class StreamEx3 {
    public static void main(String[] args) {
        String[] arr = {"남해이", "최지열", "남행선", "우영우", "고유림", "나희도"};
        Stream<String> stream1 = Arrays.stream(arr); // 배열로부터 스트림을 받음
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 1~3미만 배열 만들기 ex)최치열 남행선
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 숫자 범위로부터 스트림 만들기
        IntStream stream = IntStream.rangeClosed(1, 100);
        int sum = stream.sum();
        System.out.println("합계 : " + sum);

    }
}
