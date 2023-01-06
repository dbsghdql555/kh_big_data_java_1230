package 반복문forEX1;

import java.util.Scanner;

//for 반복문 : for(초기식;조건식;증감식)
public class ForEx1 {
    public static void main(String[] args) {
//        for (int i = 1; i <=100; i++) { //무한 루프 for(;;)
//            System.out.printf("%4d",i);//4개의 공간을 잡고 오른쪽으로 줄을 맞춤
//            if (i%10==0) System.out.println();
//        }
//        int i = 1;
//        while (i <=100){
//            System.out.printf("%4d",i);
//            if (i%10==0) System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);
        }
        public static int recursiveFunc(int n) { //결과를 int로 넘겨줌
            if(n==1) return 1;
            return n + recursiveFunc(n - 1);
        }
    }

