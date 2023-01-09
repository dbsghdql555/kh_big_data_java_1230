package 배열기타문법;
import java.util.Arrays;
public class BasicArrayEtc {
    public static void main(String[] args) {
//        String[] city = {"서울", "부산", "대구", "인천", "수원"};
//        for(String e : city) System.out.print(e + " ");
//        System.out.println();
//        System.out.println(city[3]); //인천
        if (args.length != 2) {
            System.out.println("외부에서 전달한 값이 없어 강제 종료함");
            System.exit(0);
        }
        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));
    }
}
