package cond.ex;

public class ScoreEx {
    /*
    학생의 점수를 기반으로 학점 출력하는 자바 프로그램 작성. 다음 기준 따른다.
    90점 이상: "A" 80점 이상 90점 미만: "B" 70점 이상 80점 미만 "C" 60점 이상 70점 미만 "D" 60점 미만 "F"
    점수는 변수(int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
     */

    // 답 안 보고 작성
    public static void main(String[] args) {
        int score = 96;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    /*
    // 정답
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
    }
     */
}
