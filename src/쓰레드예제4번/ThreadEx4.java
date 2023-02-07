package 쓰레드예제4번;

public class ThreadEx4 {
    public static void main(String[] args) {
        SumTh sumTh = new SumTh();
        sumTh.start();
        try {
            sumTh.join(100); // sumTh가 종료 될때까지 main 이 대기하고 있음
            // 만약, 대기하지 않고 실행한다면 sumTh가 실행되기 전에 main 이 찍히고 프로그램을 종료함
        } catch (InterruptedException e) {}
        System.out.println("합 : " + sumTh.getSum());
    }
}
class SumTh extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum += 1;
            try {
                sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
