package 입출력스트림연습문제;

import org.jetbrains.annotations.NotNull;
import 클래스정렬연습문제.Student;

import java.util.Comparator;

public class StudentInf implements Comparable<StudentInf> {
    private String name;
    private int kor;
    private  int eng;
    private int mat;

    public StudentInf(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    int getTotal() {
        return kor + eng + mat;
    }
    String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull StudentInf o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();
    }

}
