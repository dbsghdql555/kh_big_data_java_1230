package 쓰레드예제5번;
// 스레드간의 협업 : wait(), notify(), notifyAll()
// wait() : 현재의 스레드를 일시정지 상태로 전환 시킴
// notify() : 대기 상태에 있는 스레드를 실행 대기 상태로 전환 시킴, 실행은 운영체제가 함
// notifyAll() : 일시 정지된 모든 스레드를 실행 대기로 만듬
public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);
        ThreadB thB = new ThreadB(sharedObject);
        thA.start();
        thB.start();
    }
}
