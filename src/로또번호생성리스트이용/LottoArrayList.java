package 로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 갯수 지정 필요 없음
        HashSet<Integer> hashSet = new HashSet<>();
        int tmp; // 로또 번호를 임시로 저장하는 번수
        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            hashSet.add(tmp);
//            if (!list.contains(tmp)) list.add(tmp);//리스트에 포함되어있지 않으면
            if (hashSet.size() == 6) break;
        }
//        for (Integer e : list) System.out.print(e + " ");
        System.out.println(hashSet);

    }
}