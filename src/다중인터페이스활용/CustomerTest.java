package 다중인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer Type의 customer 참조변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형 변환)
        // Buy buyer = new Customer(); 위의 것과 같은 의미
        buyer.buy();// buyer는 Buy 인터페이스의 메소드만 호출 가능
        buyer.order(); // 재정의된 메소드가 호출 됨
        Sell seller = customer; // 자동 형변환
        seller.sell();
        seller.order(); //오버라이딩 된 메소드가 출력

        //Customer customer1 = (Customer) sell; // 다시 역으로 형변환 (다운 캐스팅)
//        customer1.buy();
//        customer1.sell();
    }
}
