package 평균올리기;

import java.util.Scanner;

public class Aver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double aver = 0;

        for (int i = 0; i < num; i++) {
            int arr[] = new int[sc.nextInt()];
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
                }
            double mean = (sum / arr.length) ;
            double count = 0;

            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            aver = (count/arr.length)*100;

            System.out.println(aver);
            }

        }
    }

