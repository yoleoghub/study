package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // [주제 1] 독립조건일 때는 if문 각각 작성
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");   // 총 할인 금액: 2000원

        // [주제 2] else if문은 앞이 만족하면 뒤 수행 안 됨(유의). else 안 써도 상관없지만 써볼게
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");   // 총 할인 금액: 3000원 (기존 2000원에서 1000원 증가)

        // [주제 3] if문 사용 시 유의할 점
        // 38-40행 모두 가능은 함(단 한 줄일 때) 코드블록 생략 가능. 다만 권장하지 않음. 그 이유는 42행
        if (true)
            System.out.println("if문에서 실행됨1");
        if (true) System.out.println("if문에서 실행됨2");

        if (true)
            System.out.println("if문에서 실행됨3");
            System.out.println("if문에서 실행안됨");   // if문 조건충족과는 무관하게 단독으로 실행되는 것
        /*
        42-44행은 이것과 같다.
        if (true)
            System.out.println("if문에서 실행됨3");
        System.out.println("if문에서 실행안됨");
         */

        // 근데 42-44행이 그닥 좋은 예시는 아니니 다음으로 바꿔보자
        if (false)  // 조건을 false로 하면 54-55행 모두 출력 안 돼야 하지만, 실행결과로 55행은 출력된다.
            System.out.println("if문에서 실행안됨5");
            System.out.println("if문에서 실행됨6");

        // 여기까지 최종 출력 결과
        /*
        총 할인 금액: 2000원
        10000원 이상 구매, 1000원 할인
        총 할인 금액: 3000원
        if문에서 실행됨1
        if문에서 실행됨2
        if문에서 실행됨3
        if문에서 실행안됨
        if문에서 실행됨6
         */

        // sol) 코드블록 중괄호 { } 사용하자! 한 줄이어도 중괄호 쓰는 게 좋다. 가독성/유지보수성 관점에서도 좋다
    }
}
