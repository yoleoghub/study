package operator;

public class Operator1 {    // [주제 1] 산술 연산자: 정수형 더하기

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);   // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // int형이라서 소수점 표현이 안 됨 그래서 2.5 -> 2
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;    // 5 / 2 = 몫 2, 나머지 1
        System.out.println("a % b = " + mod);

        // 추가실습
        //int z = 10 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero    // 0으로 나누기 안 됨
        // 문제가 발생한 31행 이후로는 출력 안 됨 즉 28행까지 결과만 콘솔창에 출력되고 그 다음줄에 31행같은 에러 문장이 출력되는 것
    }
}