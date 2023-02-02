package 클래스정렬연습문제;



import java.util.Comparator;

public class Descend implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score == o2.score) {
            return o1.id - o2.id;
        }
        return o2.score - o1.score;
    }
    @Override
    public Comparator<Student> reversed(){
        return Comparator.super.reversed();
    }
}


