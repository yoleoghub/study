package cond.ex;

public class CondOpEx {
    /*
    더 큰 숫자 찾기: 두 개의 정수 변수 a, b 가지고 있다. a의 값은 10이고, b의 값은 20이다.
    삼항 연산자 사용하여 두 숫자 중 더 큰 숫자 출력하는 코드 작성하자.
     */

    // 안 보고 작성
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //int max = (a > 10) ? "더 큰 숫자는 " + a + "입니다." : "더 큰 숫자는 " + b + "입니다.";   // 뭔가 잘못된 거ㄹ 느낌
        int max = (a > 10) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }

    /*
    정답
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
     */

    // 느낀 점
    //안 쉬고 쭉 진행하다보니 15행같은 말도 안 되는 코드를 작성해버렸다. 그래도 이번에 복습하면서 아차 싶었으니 이 부분은 잘 기억될 것 같다.
    // 다행히 a가 10이었으니 원하는 결과값이 나왔지 30이었으면 원하는 결과값 못 찾았을 거다. 한 줄 적고 맞게 적었는지 차분히 검토하는 습관!
    // 맞다고 넘어가기보다는!
}
