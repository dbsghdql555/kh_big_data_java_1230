package 소수판별하기;

import java.util.Scanner;

// 소수란 : 1과 자기자신 이외에는 나누어지지 않는 수
// 소수 판별하기 :
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 : " + rst);
    }

    static boolean isPrime(int n) { // static을 붙여 클래스 소속으로 만듬
        boolean result;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false; //전달 받은 수를 1과 자신을 제회하고 나누어지는 경우를 의미
            }
        return true;
        }
    }


