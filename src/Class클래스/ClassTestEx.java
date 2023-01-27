package Class클래스;

import 상속실습예제.Person;

public class ClassTestEx {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);

        Person1 person = new Person1();
        Class pCls = person.getClass();
        System.out.println(pCls.getClass());
        System.out.println(pCls.getSimpleName());
    }
}

class Person1 {

}