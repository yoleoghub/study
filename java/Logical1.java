package operator;

public class Logical1 {

    public static void main(String[] args) {
        // [주제 1] 논리 연산자
        System.out.println("&&: AND 연산");   // '산' 뒤에 커서 있을 때 Command+Shift+Enter: 7행으로 커서 넘어감
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && false); // false

        System.out.println("||: OR 연산");
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || false); // false

        System.out.println("! 연산");
        System.out.println(!true);          // false
        System.out.println(!false);         // true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);         // false
        System.out.println(a || b);         // true
        System.out.println(!a);             // false
        System.out.println(!b);             // true

        // [주제 2] 논리 연산자 활용
        int c = 15;
        // c는 10보다 크고 20보다 작다
        //boolean result = c > 10 && c < 20;        // 비교연산자가 대입연산자보다 우선순위 높음. (c > 10) && (c < 20)
        boolean result = 10 < c && c < 20;          // 순서 상관없으므로. 범위가 지정된 느낌. 읽기가 더 좋을 것!
        System.out.println("result = " + result);   // true
    }
}