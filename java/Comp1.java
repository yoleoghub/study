package operator;

public class Comp1 {
    public static void main(String[] args) {
        // [주제 1] 비교 연산자
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false
        System.out.println(a != b); // true

        System.out.println(a > b);  // false
        System.out.println(a < b);  // true

        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        // 결과를 boolean 변수에 담을 수 있다(비교연산자는)
        boolean result = a == b;
        System.out.println(result); // false

        // [주제 2] 문자열 비교
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");      // 리터럴 비교
        boolean result2 =  str1.equals("문자열1");        // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2);            // 문자열 변수 비교

        System.out.println(result1);    // true
        System.out.println(result2);    // true
        System.out.println(result3);    // false

        // 물론 36행 결과 true나옴. 근데 어떤 특정한 조건에선(클래스, 인스턴스, 객체 알아야 이해 가능) true 안 나올 때도 있어.
        // 그러니 문자열 비교에 == 쓰면 안 된다
        //System.out.println("hello" == "hello"); // true

        // [단축키] (전제) 맨 뒤에 아직 세미콜론 안 붙였을 때
        // (단축키) Command+Shift+Enter <- Mac, Windows -> Ctrl+Shift+Enter
        // result1뒤에 커서 있을 때 누르면, 스페이스하고 세미콜론 누르는 과정 생략 가능
        System.out.println(result1);
    }
}