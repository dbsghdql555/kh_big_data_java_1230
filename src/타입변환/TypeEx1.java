package 타입변환;
//하나의 타입을 다른 타입으로 변경하는 것
//묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것
//명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
//메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
//Double.parseDouble(); 문자열을 실수 타입으로 변경
//진수 표현 : 16진수, 18진수, 8진수, 2진수
public class TypeEx1 {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double rst1 = num1 / num2; //문제가 발생하는 코드, 묵시적 형변환
//        double rst2 = (double)num1/num2;//묵시적형변환이 일어남
//        double rst3 = 100 + 100.1;//묵시적 형변환, 100 정수를 실수로 변형
//        System.out.println(rst2);
//        System.out.println(rst1);
//
//        String phoneNumber="01085067190";
//        String name = "곰돌이사육사";

        //int numName = Integer.parseInt(name);
        //System.out.println(name);//에러, phoneNumber는 정수인 문자열이라 문자열에서 정수로 형변환이 가능하지만 name은 정수가 아니라 변환하지 못함

//        double number = Double.parseDouble(phoneNumber);
//        System.out.println(number);
        int var1 = 0b1010; //2진수
        int var2 = 0267; //8진수
        int var3 = 399; //10진수
        int var4 = 0x100abcde; //16진수
        System.out.println("var1: "+ var1 );
        System.out.println("var2: "+ var2 );
        System.out.println("var3: "+ var3 );
        System.out.println("var4: "+ var4 );



    }
}
