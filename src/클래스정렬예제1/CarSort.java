package 클래스정렬예제1;
// 자동차 연식으로 정렬하기
import org.jetbrains.annotations.NotNull;
import 다중인터페이스.Car;

public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 앞의 문자열 사전순으로 뒤에 있으면 양수 값 반환
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름 차순 정렬)
    }
}
