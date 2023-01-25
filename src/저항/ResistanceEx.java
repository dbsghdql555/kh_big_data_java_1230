package 저항;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        String [] color = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        ArrayList<String> Color = new ArrayList<>(Arrays.asList(color));
        long[] result = new long [] {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        long arr [] = new long[3];
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        arr[0] = 10*Color.indexOf(input1);
        String input2 = sc.next();
        arr[1] = Color.indexOf(input2);
        String input3 = sc.next();
        arr[2] = result[Color.indexOf(input3)];
        System.out.println("결과 값 : " + (arr[0]+arr[1]) * arr[2]);



        }
    }

