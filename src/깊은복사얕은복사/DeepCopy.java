package 깊은복사얕은복사;

import 입출력예제.SystemInOut;

import java.util.Arrays;

// 깊은 복사 : 할당된 메모리공간에 실제 값이 복사 되는 것 (기본 타입은 모두 여기에 해당)
// 얕은 복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것을 의미함
public class DeepCopy {
    public static void main(String[] args) {
//        int x = 100;
//        int y;
//        y = x;
//        x = 200;
//        System.out.println("y의 값 : " + y);
        //얕은 복사가 발생하는 경우
        int[] arr = new int[4];
        arr[0] = 100;
        //int[] arr2 = arr;// 얕은 복사가 일어남
        int[]arr2 = Arrays.copyOf(arr,arr.length); //깊은 복사
        arr[0] = 300;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }


}
