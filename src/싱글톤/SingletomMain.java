package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 법
// 사용하는 이유 : 메모리의 효율성과 데이터 공유의 이점이 있음
// 단점 : 구현이 까다로움, 데이터의 무결성이 깨질 수 있음(멀티쓰레드에서 사용시 syncronized 사용
public class SingletomMain {
    public static void main(String[] args) {
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();

        ref1.setInfo("동그라미", 27);
        ref2.viewInfo();
    }
//        Singleton singleton1 = Singleton.getSingleton(); //이미 만들어져있는 객체의 주소를 넘겨받음
//        Singleton singleton2 = Singleton.getSingleton();
//        if (singleton1 == singleton2) { // ==는 참조하는 주소를 비교한다.
//            System.out.println("같은 싱글톤 객체를 참조 합니다.");
//        } else {
//            System.out.println("다른 싱글톤 객체를 참조 합니다.");
//        }
//        singleton1.id = 999;
//        singleton1.name = "곰돌이" ;
//        System.out.println(singleton1.id);
//        System.out.println(singleton1.name);
//        System.out.println(singleton2.id);
//        System.out.println(singleton2.name);
//    }
}
