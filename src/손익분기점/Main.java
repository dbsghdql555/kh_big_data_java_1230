package 손익분기점;
// 첫번째 : 고정비용
// 두번째 : 가변비용
// 세번째 : 판매금액
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = (sc.nextInt());
        int B = sc.nextInt();
        int C = sc.nextInt();
        int count = 0;
        if (C < B) count = -1;

        while (true) {
            if (count > A / (C-B)) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
