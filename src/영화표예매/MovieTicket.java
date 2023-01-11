package 영화표예매;

import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
    int seat[] = new int[10];

    int totalAmount() {
        int cnt = 0;
        for(int val : seat) {
            if (val == 1) cnt++;
        }
        return cnt * 12000;
    }
    void printSeat() {
        for(int i = 0; i < seat.length; i++) {
            if(seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 하세요. : ");
        int seatPos = sc.nextInt();
        if(seat[seatPos-1] == 0) {
            seat[seatPos-1] = 1;
            printSeat();
        } else System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
    }
}