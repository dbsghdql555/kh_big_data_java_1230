package 진수8진수2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = {"", "1","10","11","100","101","110","111"};
        String [] arr1 = {"000", "001","010","011","100","101","110","111"};
        String num = sc.next();
        int arrNum;
        for (int i = 0; i < num.length(); i++) {
            arrNum = ((int)num.charAt(i) - '0');
            if (num.length() == 1 && num.charAt(0) - '0' == 0) {
                System.out.print("0");
                break;
            }
            if (i == 0) {
                System.out.print(arr[arrNum]);
            }
            else {
                System.out.print(arr1[arrNum]);
            }
        }

    }
}
