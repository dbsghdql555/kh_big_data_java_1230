package 다중인터페이스활용;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 주문"); //order를 오버라이드해 앞에 있던 order에 덮어씌움
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
