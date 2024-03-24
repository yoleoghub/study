package cond;

public class Switch1 {  // if문은 비교 연산자 사용 가능. 다만 switch문은 단순히 값이 같은지만 비교 가능

    public static void main(String[] args) {
        // [주제 1] if-else if-else
        int grade1 = 2;

        int coupon1;
        if (grade1 == 1) {
            coupon1 = 1000;
        } else if (grade1 == 2) {
            coupon1 = 2000;
        } else if (grade1 == 3) {
            coupon1 = 3000;
        } else {
            coupon1 = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon1);    // 발급받은 쿠폰 2000

        // [주제 2] switch문으로 변환. case 다음에 값을 바로바로 알 수 있다는 점에서 직관적이란 장점 있음
        int grade2 = 2;

        int coupon2;
        switch (grade2) {
            case 1:
                coupon2 = 1000;
                break;
            case 2:                 // 30-31행처럼 break문 없어지면, case3의 값(3000)이 출력되는 구조
                //coupon2 = 2000;
                //break;
            case 3:
                coupon2 = 3000;
                break;
            default:
                coupon2 = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon2);   // (30-31행 있을 때) 발급받은 쿠폰 2000 (30-31행 없을 때) 발급받은 쿠폰 3000

        // [주제 3] 자바 14 이후 새로운 switch문 등장(지금 자바 14 이후를 쓰는 곳은 많지 않지만 주제 2보다 좀더 간결한 switch문으로 알려짐)
        int grade3 = 0;

        int coupon3 = switch (grade3) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon3);   // 500원 (grade3 = 0이므로)
    }
}
