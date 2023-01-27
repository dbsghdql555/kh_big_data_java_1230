package 제네릭일반;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크 / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경사항
public class GenericTestEx {
    public static void main(String[] args) {
        List list = new ArrayList(); //오브젝트타입
        list.add("안녕하세요");
        String str = (String) list.get(0); //오브젝트타입 -> 스트링타입 // 자바 8이전 스타일

        //제네릭 타입
        //List 에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입체크가 일어 나도록 함
        List<String>list1 = new ArrayList<>(); //강력한 타입체크, 따라서 스트링만 들어갈 수 있음
        list1.add("hello");
        String str1 = list1.get(0); // 위의 list로 찍으면 에러남 //0번째 값을 읽어옴
        System.out.println(str1);
    }
}
