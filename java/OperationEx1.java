package operator.ex;

public class OperationEx1 {
    /*
    1. num1, num2, num3 라는 이름의 세 개 int 변수 선언, 각각 10, 20, 30으로 초기화
    2. 세 변수 합 계싼, 그 결과 sum이란 이름의 int 변수에 저장
    3. 세 변수 평균 계산, 그 결과를 average 라는 이름의 int 변수에 저장. 평균 계산 시 소수점 이하의 결과는 버림하세요.
    4. sum과 average 변수의 값을 출력하세요
     */

    // 답 안 보고 작성
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println(sum);        // 60
        System.out.println(average);    // 20
    }

    // 정답
    /*
    public static void main(String[] args) {
        int num1 = 10;  // 물론 14행처럼 써도 되는데 그렇게 쓰는 게 익숙하진 않더라구요(선생님 왈)
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average);
    }
     */

    // 느낀 점
    // 13행, 14행 사이를 한 줄 띄어주는 게 가독성 측면에서 좀 더 좋을 것 같다.
    // 13행처럼 쓰는 것도 복습차원에서 한 것이기도 하고 나쁜 건 아닌데 그냥 정답인 24-26행처럼 쓰는 습관을 가져보도록 하자
}