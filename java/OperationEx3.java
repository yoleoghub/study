package operator.ex;

public class OperationEx3 {
    /*
    1. int형 변수 score를 선언하세요.
    2. score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.
     */

    // 답 안 보고 코딩
    public static void main(String[] args) {
        int score = 90; // 0으로 초기화했을 땐 false, 90으로 값을 변경(여기선 초기화)했을 땐 true 나왔다.
        boolean result = (80 <= score) && (score <= 100);

        System.out.println(result);
    }

    /*
    // 정답
    public static void main(String[] args) {
        // [22행 tip] 경계에 있는 범위로 검증해보면 된다
        int score = 80; // 처음 80일 땐 true지만 79로 바꾸면 false, 100점이면 true지만 101점이면 false
        boolean result = score >= 80 && score <= 100;
        // 물론 23행을 다음과 같이 풀어도 된다.
        // boolean result = 80 <= score && score <= 100;    // 단 위치 바꿀 때 >= 를 <= 로 방향 바꾸는 거 잊지 말고!
        System.out.println(result);
    }
     */
}
