package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 N개로 이루어질 배열 A와 정수 X가 주어진다. 이때 A에서 X보다 작은 수를 모두 출력
// 10 5 => 배열의 길이와 주어진 수
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int a = sc.nextInt();
        int x = sc.nextInt();
        int n;
        for (int i = 0; i<a; i++) {
            n = sc.nextInt();
            arr.add(n);
            }
        for (Integer e : arr) if (e<x) System.out.print(e + " ");
        }

    }

