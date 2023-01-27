package 스트링토큰;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우, 구분자 기준으로 문자열을 관리 할 수 있음
// countTokens() : 남아있는 토큰의 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인 (있으면 true)
// nextToken() : 토큰을 하나씩 꺼내 옴
public class TokenTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int idx = 0;
        System.out.println("이름을 / 기준으로 입력");
        String name = sc.nextLine(); // 문자열을 개행문자를 만날 떄 까지 입력 받음
//        StringTokenizer st = new StringTokenizer(name, "/"); // 배열과 구분자를 객체 생성 시 넣어줌
//        String[] nameStr = new String[st.countTokens()]; // nameStr 배열 생성, 갯수는 st에 들어있는 토큰의 수
//        while (st.hasMoreElements()) { // hasMoreTokens으로 토큰이 남이있을 때 까지 true
//            nameStr[idx++] = st.nextToken(); //
//        }

        String[] nameStr = name.split("/");
        for (String e : nameStr) System.out.print(e + " ");
    }
}
