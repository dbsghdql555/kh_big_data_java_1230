package 평균점수구하기;

import java.util.Arrays;
import java.util.Scanner;

//상현이가 가르치는 학생은 총 5명(안유진, 유나, 채원, 카즈하, 장원영)
//기말고사를 치고난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정 해줌
//모든 학생이 보충학습을 들음
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상이고, 100점 이하인 5의 배수이다.
public class ArrayExAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 40)   arr[i] = 40;
            sum += arr[i];
        }
        System.out.printf(Arrays.toString(arr));
        System.out.printf("평균 값 : " + sum/arr.length);
        }
    }

