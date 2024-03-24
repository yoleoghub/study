package cond.ex;

public class EvenOddEx {
    /*
    홀수 짝수 찾기: 정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 홀수이면 "홀수"를 출력하는 프로그램 작성하자. 삼항 연산자 사용해야 한다.
    참고로 x % 2 사용하면 홀수, 짝수 쉽게 계산 가능
     */

    // 안 보고 작성
    /*
    public static void main(String[] args) {
        int x = 12;

        //int evenResult = (x % 2) ? 0 : 1;         // 문제 발생
        //boolean evenResult = (x % 2) ? 0 : 1;     // 14행 문제 발생해서 다시 작성

        //System.out.println("x = " + x + ", " + evenResult);
    }
     */

    // 정답
    public static void main(String[] args) {
        int x = 3;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
