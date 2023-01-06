package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이사육사";
        nameCard.age = 25;
        nameCard.address = "경기도 안산";
        nameCard.email = "dbsghdql555@nate.com";
        nameCard.phoneNumber = "010-8506-7190";
        System.out.println(nameCard.name);
    }
        }


    //사용자 정의 자료형
    class NameCard {
        String name;
        int age;
        String address;
        String email;
        String phoneNumber;
    }

