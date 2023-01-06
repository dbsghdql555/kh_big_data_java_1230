package 배열을향상된for;
// 향상된 for문은 배열의 요소를 처음부터 끝까지 자동순회 할때만 써야함
// 배열의 내부의 값을 변경 할 수 없음
// 향상된 for문안에서 배열의 내부값을 바꾸면 값을 변경해서 프린트 할 순 있지만 근본적인 배열의 값은 변경할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 50, 50};
        int  sum = 0;
        for (int e : score) {
            e += 10;
            sum += e;
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", + (double)sum/score.length);
//        sum = 0;

//        for (int i = 0; i<score.length; i++) {
//            score[i] += 10;
//            sum += score[i];
//        }
//        System.out.println("총점 : " + sum);
//        System.out.printf("평균 : %.2f\n", + (double)sum/score.length);
        sum = 0;
        for (int i = 0; i<score.length; i++) {
            sum += score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", + (double)sum/score.length);
    }
}
