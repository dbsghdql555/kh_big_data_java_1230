package 입출력스트림예제4번;
// Reader는 문자 스트림의 최상위 추상 클래스 입니다.
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
//        int readData;
//        while (true) {
//            readData = reader.read(); // 한개의 문자(2바이트)을 읽어 4byte int 타입으로 반환
//            if (readData == -1) break;
//            System.out.print((char)readData);
//        }
        int readNo;
        char[] cBuf = new char[256];
        String data = "";
        while (true) {
            readNo = reader.read(cBuf); // 256개의 문자를 읽어 int 타입으로 반환
            if (readNo == -1) break;
            data += new String(cBuf, 0, readNo);
        }
        System.out.println(data);
        reader.close();
    }
}
