package cond.ex;

public class ExchangeRateEx {
    /*
    환율 계산하기(특정 금액을 미국 달러에서 한국 원으로 반환하는 프로그램. 환율은 1달러당 1300원이라고 가정)
    달러가 0미만이면: "잘못된 금액입니다." 달러가 0일 때: "환전할 금액이 없습니다." 달러가 0 초과일 때: "환전 금액은 (계산된 원화 금액)원입니다."
    금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자.
     */

    // 안 보고 작성
    public static void main(String[] args) {
        int dollar = 100;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {                       // dollar = 0 아니고 dollar == 0
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + (dollar * 1300) + "원입니다.");
        }
    }

    /*
    정답
    public static void main(String[] args) {
        int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {                       // dollar = 0 아니고 dollar == 0
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dolloar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
     */

    // 느낀 점
    // 32행처럼 변수를 선언해줘야 유지보수할 때 더 편리할 것 같다. 가급적이면 하드코딩보단 변수를 활용해보자
}
