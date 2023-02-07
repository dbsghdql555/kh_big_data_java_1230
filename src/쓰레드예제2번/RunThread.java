package 쓰레드예제2번;

import static java.lang.Thread.sleep;

public class RunThread implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            try {
                sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("인터페이스 상속 스레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + " 합계 : " + sum);

    }
}
