package 구간합구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Long> result = new ArrayList<>();
        long sum = 0;

        for (int i = 0; i< n; i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        while (m!=0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            for (int k = a-1; k < b; k++) {
                sum += arr.get(k);
            }
            result.add(sum);
            sum = 0;
            m--;
        }
//        for (int j = 0; j < m; j++) {
//
//        }
        for (long e : result) System.out.println(e);
    }
}
