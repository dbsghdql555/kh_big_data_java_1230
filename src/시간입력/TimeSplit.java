package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String times = sc.next();
        String[] splitTime = times.split(":");
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);

        if(intHour > 11) {
            intHour -= 12;
            System.out.printf("오후 %2d시 %2d분 %2d초\n", intHour, intMin, intSec);
        }else System.out.printf("오전 %2d시 %2d분 %2d초\n", intHour, intMin, intSec);

    }
}

