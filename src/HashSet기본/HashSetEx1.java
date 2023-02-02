package HashSet기본;

import 어레이리스트객체.MenuInfo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
// 중복 여부 확인은 haseCode()의 리턴값을 이용합니다. (경우에 따라 오버라이딩 합니다.)
public class HashSetEx1 {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);
        HashSet<Member> set = new HashSet<>();
//        set.add("Java");
//        set.add("C");
//        set.add("C++");
//        set.add("Python");
//        set.add("Java");
//        for (String e : set) System.out.println(e + " ");

        set.add(new Member(1001, "유나"));
        set.add(new Member(1002,"정국"));
        set.add(new Member(1003, "안유진"));
        Member mem4 = new Member(1004,"카리나");
        set.add(mem4);
        set.add(new Member(1003, "카즈하"));

        for (Member e : set) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("--------------------");
        }
    }
}
class Member {
    int id;
    String name;


    // 객체의 중복판별은 해쉬코드와 equal()가 같아야함, 따라서 원하는 값으로 동등함을 판별하려면 hashCode 와 equals()가 같아야함
    // 따라서 그렇게 하기 위해서는 hashCode()와 equals()를 오버라이딩해 값을 변경시켜 객체가 동등하게 판별하도록 함
    @Override
    public int hashCode() {
        return id;
    }// 해쉬코드를 id 값으로 변경함

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember () {
        System.out.println("아이디 : " + id );
        System.out.println("이름 : " + name);
        System.out.println("-------------------");
    }
}