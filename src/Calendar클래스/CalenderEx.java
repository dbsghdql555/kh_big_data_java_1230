package Calendar클래스;

import java.awt.*;
import java.util.Calendar;

// Calendar 클래스는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이하기 때문
// 정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴, 포함된 필드도 전부 class 변수
public class CalenderEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH + 1));
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 월에서 몇번째 주
//        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 년에서 몇번째 주
//        System.out.println(now.get(Calendar.AM_PM)); // 오전 오후 표시, 정수로 출력
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
        // yyyy년MM월dd HH시mm분ss초 :
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        if (isPM == 1)

        System.out.printf("%d년%d월%d일 %d시%d분%d초",now.get(Calendar.YEAR),now.get((Calendar.MONTH)+1),now.get(Calendar.DATE),now.get(Calendar.HOUR),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
    }
}
