package 입출력스트림연습문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 적절한 위치에 이름과 성적 파일 생성
        // -- TreeSet<클래스> ts = new TreeSet<>();
        // 2. FileInputStream 으로 생성된 파일을 읽기 위한 스트림 생성
        // 3. 파일을 스캐너를 읽어 들이기 위해 스캐너 생성하고 스캐너의 입력으로 스트림 연결
        // 4. 스캐너의 hasNextLine() 메소드를 이용해 읽을 라인이 있는 동안 반복 수행
        // 5. 스캐너의 nextLine()로 라인별로 문자열을 읽어 들임 (예 : 안유진 98 87 45)
        // 6. 입력 받은 문자열을 split(" ")을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열이 생성)
        // 7. 첫번째 요소는 문자열이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
        // 8. ts.add(new 클래스(생성자));
        // 9. 향상된 for문을 순회하면서 결과 출력

        // 1. 이름과 3개의 성적을 객체 단위로 관리하기 위해 클래스 생성하고 정렬을 위해 Comparable 을 상속 받거나 Comparator
        // 2. Comparable를 상속 받아 정렬 기준에 대한 메소드를 오버라이딩해 정렬에 대한 조건을 구현 하거나 Comparator를 상속 받
        // 3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순으로..)

//        FileInputStream inputStream = null;
//
//        try {
//            inputStream = new FileInputStream("src/StuScore.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner sc = new Scanner(inputStream);
//        TreeSet<Integer> score = new TreeSet<>();
//        ArrayList<Integer> higher = new ArrayList<>();
//
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            String[] arr = line.split(" ");
//            int sum = 0;
//                for (int i = 1; i < arr.length; i++) {
//                    sum += Integer.parseInt(arr[i]);
//                }
//            score.add(sum);
//        }
//        for (int i = score.size(); i < 1; i--){
//            higher.add(score)
//        }
//    }
        TreeSet<StudentInf> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("src/StuScore.txt");
        Scanner sc = new Scanner(is);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInf(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for (StudentInf e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
