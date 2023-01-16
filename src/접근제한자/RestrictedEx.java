package 접근제한자;

import 입출력예제.ParentRest;

// 접근제한자는 객체지향언어 4가지 중요 특성 중에 하나 입니다.
// 사용 목적은 내부의 필드값을 외부에 접근하는 것을 제한하는 목적으로 사용 합니다.
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs);
       // System.out.println(childRest.money); money는 protected로 main은 다른 패키지이고 상속관계도 아니므로 에러[

    }
}

class ChildRest extends ParentRest {
    String jobs;
    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
}