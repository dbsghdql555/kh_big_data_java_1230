package 배열의활용;

import java.lang.reflect.Array;
import java.util.Arrays;

// arraycopy() : 배열값을 복사할 때 사용
// copyOf() : 배열을 원하는 길이만큼 새로운 배열로 복사
public class ArrayApply {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; // 원본 데이터
//        int len = 10;
//        int[] arr2 = new  int[len];
//        System.arraycopy(arr1, 0, arr2, 4,arr1.length); //arr1의 0번째부터 arr.length까지 arr2의 4번째부터 넣어줌
//        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr3));
    }

}

