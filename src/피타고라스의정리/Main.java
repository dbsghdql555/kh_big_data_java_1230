package 피타고라스의정리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//            while (true){
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                int c = sc.nextInt();
//                if (a == 0 && b == 0) break;
//                if (c == 0) break;
//                if (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)) list.add("right");
//                if (Math.pow(a,2)+Math.pow(c,2) == Math.pow(b,2)) list.add("right");
//                if (Math.pow(b,2)+Math.pow(c,2) == Math.pow(a,2)) list.add("right");
//                else list.add("wrong");
//                for (String e : list) System.out.println(e);
//
//
//            }
//
        int [] arr = new int[3];
        ArrayList<String> result = new ArrayList<>();
        while (true) {
            int sum = 0;
            for (int i =0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum == 0)break;
            Arrays.sort(arr);
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
               result.add("right");
            } else result.add("wrong");
        }
        for (String e : result) System.out.println(e);
        }
    }

