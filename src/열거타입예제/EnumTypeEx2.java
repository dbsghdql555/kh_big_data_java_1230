package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer1 = new Developer("윤홍비", DevType.FRONTEND, Career.JUNIOR,Gender.FEMALE);
        developer1.devINfo();
        Developer developer2 = new Developer("곰돌이", DevType.EMBEDDED, Career.SENIOR,Gender.MALE);
        developer2.devINfo();
    }
}
