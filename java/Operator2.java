package operator;

public class Operator2 {

    public static void main(String[] args) {

        // [주제 1] 문자열 더하기

        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 1
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1(숫자를 문자열(String)로 바꾼 다음에 더함)
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = 20";
        System.out.println(result4);

        // [주제 2] 연산자 우선순위
        int sum1 = 1 + 2 * 3;   // 1 + (2 * 3) = 7
        int sum2 = (1 + 2) * 3; // 9
        System.out.println("sum1 = " + sum1);   // [단축키] soutv
        System.out.println("sum2 = " + sum2);

        // [주제 3]
        int sum3 = 2 * 2 + 3 * 3;    // (2 * 2) + (3 * 3)   // 생각 굳이 해야 됨
        int sum4 = (2 * 2) + (3 * 3);                       // 생각 안 해도 됨. 명확. 읽기 쉬움!
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
