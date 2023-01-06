package 참조타입확인;

public class RefType {
    public static void main(String[] args) {
//        int x = 0;
//        String str = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
//        int[] intArray = null;
//        Integer val = null;
//        Integer val1 = 0; //int의 참조타입, 기본값을 넣어도 내부적으로 참조값으로 바꿈
//        int val2 = val; //NullPointException이 발생
//        System.out.println(val2); //주소값이 null이므로 죽어버림

        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3) { //메모리 공간의 주소가 같냐?
            System.out.println("두개의 이름에 대한 참조가 같음");
        }else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if(name1.equalsIgnoreCase(name3)) { //두개의 값이 같냐? equlas : 내용만 비교 equalsIgnoreCase : 대소문자가 달라도 같다고 처리
            System.out.println("두개의 이름이 내용이 같음");
        }else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
}
