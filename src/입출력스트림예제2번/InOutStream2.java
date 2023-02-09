package 입출력스트림예제2번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상 클래스 입니다.
public class InOutStream2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while (true) {
            int data = is.read(); // 1 바이트 씩 읽기
            if (data == -1) break; // 파일의 끝에 도달, byte 값은 -값이 없기 때문에
            System.out.println(data + " ");
            int readByteNum = is.read(buffer, 1, 2); // 매개변수로 전달한 buffer 에 값을 담음
            if (readByteNum == -1) break;
            // 배열에 읽어들일 byte 개수를 정하고 배열을 read()에 담아 데이터를 배열의 갯수만큼 배열에 가져와
            // readByteNum 에 가져옴, readByteNum 이 -1이 되면 파일을 전부 읽음
            for (int i = 0; i<readByteNum; i++) {
                System.out.println(buffer[i] + " ");
            }
        }
        is.close(); // 읽기 위해 열어 둔 스트림을 닫음
        // 버퍼를 닫지 않는 이유는 입력을 하기 위해 생성한 버퍼가 없기 때문이다.

    }
}
