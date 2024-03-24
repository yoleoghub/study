package cond.ex;

public class GradeSwitchEx {
    /*
    학점에 따른 성취도 출력하기
    String grade라는 문자열 만들고, 학점 따라 성취도 출력 프로그램 작성.
    "A": "탁월한 성과입니다!" "B": "좋은 성과입니다!" "C": "준수한 성과입니다!" "D": "향상이 필요합니다." "F": "불합격입니다."
    나머지: "잘못된 학점입니다." switch문을 사용해 문제 해결하자.
     */

    // 안 보고 작성
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }
    }

    /*
    // 정답
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
     */
}
