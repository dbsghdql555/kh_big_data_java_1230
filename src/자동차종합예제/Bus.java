package 자동차종합예제;

public class Bus extends Car{
    public Bus(String name) {
        this.name = name;
        speed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }
    @Override
    public void setMode(boolean isMode) {

    }
}
