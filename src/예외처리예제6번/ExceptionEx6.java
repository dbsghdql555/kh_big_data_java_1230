package 예외처리예제6번;

import java.io.IOException;
// 예외처리 미루기 : 해당 메소드 내에서 발생한 예외 처리에 대한 책임을 메소드를 호출한 쪽으로 떠넘김
public class ExceptionEx6 {
    public static void main(String[] args) {
        IOSample sample  = new IOSample();
        try {
            sample.input();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } // 예외 처리를 여러개로 달아줄 수도 있다.

        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}
class IOSample{
    private int num;
    public void input() throws IOException{
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }


}

class ThrowEx {
    String str = "";
    public void printStr(int cnt) {
        if (str == null) {
            System.out.println("str이 null 입니다.");
            throw  new NullPointerException();
        }
        for (int i = 0 ; i < cnt; i++) {
            System.out.println(str);
        }
    }
}
