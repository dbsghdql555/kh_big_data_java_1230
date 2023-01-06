package 배열로로또번호생성;
//1~45 사이의 임의의 수 6개로 구성
//1. 배열로 로또 번호를 생성해 출력 하기
//2. 배열로 로또 번호 생성(중복 제거)
//3. 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
public class RandomLotto {
    public static void main(String[] args) {
        // 정수형 배열 생성, 갯수는 6개(로또 번호 저장을 위한 공간)
        // 반복문(6회)을 만들어 순회하면서 1~45 사이의 임의의 숫자를 배열에 대입
        // v = (int) ((Math.random() * 45) + 1
        // 배열의 요소를 출력
        int number[] = new int[6];
        for (int i = 0; i <number.length; i++) {
            number[i] = (int) ((Math.random() * 45) + 1);
            System.out.printf(number[i] + ", ");
        }
        System.out.print("\b\b");

    }
}
