package 블랙잭;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int var =  0;
        int sum;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
                for (int j = i+1; j<arr.size(); j++) {
                    for (int k = j+1; k<arr.size(); k++){
                        sum = arr.get(i)+arr.get(j)+arr.get(k);
                        if (sum > var && sum <= m){
                            var = sum;
                    }

                    }
                }
            }
        System.out.println(var);
        }

    }
