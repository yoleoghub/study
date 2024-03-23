package operator.ex;

public class OperationEx2 {
    /*
    다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램 작성하세요.
    double val1 = 1.5;
    double val2 = 2.5;
    double val3 = 3.5;
     */

    // 답 안 보고 직접 작성
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;
        double average = sum / 3;

        System.out.println(sum);
        System.out.println(average);
    }

    /*
    // 정답
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;    // 아까와 달리 double로 하면 뒤에 소수점 다 남아있을 것
        double avg = sum / 3;

        System.out.println(sum);    // 7.5
        System.out.println(avg);    // 2.5
    }
     */

    // 느낀 점
    // 13-15행: Command+Shift+D를 통해 복사-붙여넣기를 쉽게 할 수 있어서 간편했다.
    // 18행: 정답에서는 average를 다 적지 않고 avg라고 축약했는데 이게 좀 더 좋은 변수명명인 것 같다.
    // 소수점을 버리려면 int와 같이 정수형으로, 남기고 싶다면 double과 같이 실수형을 변수의 데이터타입으로 선언하면 된다.
}
