package 스트림예제2번;

import java.util.ArrayList;
import java.util.List;

//
public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("남해이",89));
        list.add(new Student("최지열",99));
        list.add(new Student("남행선",79));

        // parallelStream() : 병렬처리스트림
        list.parallelStream().forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score + " " + Thread.currentThread().getName());
        });
        double avg = list.stream().mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }


    public int getScore() {
        return score;
    }


}
