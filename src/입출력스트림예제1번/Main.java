package 입출력스트림예제1번;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 입출력 스트림 : 컴퓨터 내부와 외부장치 간에 데이터를 주고 받는 것을 의미하며,
// 입출력 데이터를 공통적인 방법(추상화)으로 처리하기 위한 스트림을 제공 합니다.
// 바이트 스트림 : 바이트 단위로 데이터를 전송 하는 것, 성능이 우수하고 파일로 저장 시 결과 확인 불가
// 바이트 스트림의 최상위 추상 클래스는 OutputStream 입니다.
public class Main {
    public static void main(String[] args) throws IOException { // 파일이 존재하지 않으면 예외처리
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10,20,30,40,50};
        os.write(array,1,3); // 배열 1부터 4개를 출력

        os.flush(); // write() 이후에는 반드시 버퍼를 비우는 동작이 필요함
        os.close(); // 자원 반납 및 스트림 닫기
        // 파일스트림을 생성 후 wirte를 통해 버퍼에 값을 담아 스트림에 넣어줌, 이후 flush를 통해 버퍼를 비워주고 close를 통해 자원을 반납 빛 스트림을 닫음

    }
}
