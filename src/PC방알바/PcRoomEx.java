package PC방알바;

import java.util.Scanner;

// Pc방에 피씨가 100대 있음(배열의 인덱스는 0 ~ 99),
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리가 사용 허가
// 입력손님의 수 입력 : 3
// 손님이 앉고 싶어하는 자리 번호 :1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5 => 2(거절 횟수)
public class PcRoomEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatarr[] = new int[100];
        int set = 0;
        int no = 0;
        int num = sc.nextInt();

        for (int i = 0; i<num; i++) {
            seatarr[i] = sc.nextInt();
            for (int j = 0; j<i; j++) {
                if (seatarr[i] == seatarr[j]) {
                    i--;
                    no+= 1;
                }
            }
        }
        System.out.println("거절 횟수 : " + no);
    }

//    Scanner sc = new Scanner(System.in);
//    int seatnum = sc.nextInt();
//    int seatarr[] = new int[100];
//    int set;
//    int no = 0;
//
//        for (int i = 0; i<seatnum; i++) {
//        seatnum = sc.nextInt();
//        if (seatarr[seatnum - 1] == 1) {
//            no += 1;
//        }else {
//            seatarr[seatnum - 1] = 1;
//        }
//    }
//        System.out.println("거절 횟수 : " + no);
}
