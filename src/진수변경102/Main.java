package 진수변경102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int share = sc.nextInt();
        int div;
        int cnt = 0;
        int  result = 0;
        while (share!=0) {
            div = share%2;
            result += (int)(div*(Math.pow(10,cnt)));
            cnt++;
            share /=2;
        }
        System.out.println(result);
        String newResult = String.valueOf(result);
        int num = 0;
        int cnt1 = 0;

        for (int i = newResult.length()-1; i>=0; i--) {
                if (newResult.charAt(i) == '1') num += (int)Math.pow(2,cnt1);
                else num += 0;
                cnt1++;
            }
        System.out.println(num);
        }

    }
