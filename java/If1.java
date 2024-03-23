package cond;

public class If1 {

    public static void main(String[] args) {
        // [주제 1] if문
        int age1 = 20;   // 사용자 나이

        if (age1 >= 18) {
            System.out.println("성인입니다.");
        }

        if (age1 < 18) { // () 안이 false이면 12-14행 자체가 수행 안 되고 if 문 코드블록 밖으로 나와버림
            System.out.println("미성년자입니다.");
        }

        // [주제 2] else문
        int age2 = 17;   // 사용자 나이

        if (age2 >= 18) {   // 조건(condition)이 true이면 if 코드블록 수행되고 else는 수행 안 됨
            System.out.println("성인입니다.");
        } else {            // 조건(condition)이 false면 if 블록 수행 안 되고 else 코드블록 수행됨
            System.out.println("미성년자입니다.");
        }

        // [주제 3] else if문 (1) 불필요한 조건검사: 한 조건만 참인데도 나머지 조건 검사 모두 실행해야 한단 비효율적인 상황 발생
        int age3 = 8;

        if (age3 <= 7) {                    // 이미 7살 넘는 거 확인 가능
            System.out.println("미취학");
        }
        if (age3 >= 8 && age3 <= 13) {      // 7살 넘은 거를 또 중복체크해야되는 상황
            System.out.println("초등학생");
        }
        if (age3 >= 14 && age3 <= 16) {
            System.out.println("중학생");
        }
        if (age3 >= 17 && age3 <= 19) {
            System.out.println("고등학생");
        }
        if (age3 >= 20) {
            System.out.println("성인");
        }

        // [주제 4] else if문 (2) else if 사용하면 불필요한 조건검사 안 해도 됨. 특정조건 만족하면 그 뒤 조건 수행 안 하고 빠져나옴
        int age4 = 8;

        if (age4 <= 7) {                    // 체크완료
            System.out.println("미취학");
        } else if (age4 <= 13) {            // age4 <= 7은 체크 안 함, == (age4 > 7 && age4 <= 13과 같은 문장)
            System.out.println("초등학생");
        } else if (age4 <= 16) {
            System.out.println("중학생");
        } else if (age4 <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        // 느낀 점
        // 주제3에서 주제4처럼 (32행)age3 >= 8 && age3 <= 13에서 앞부분을 빼고 age3 <= 13만 적을 경우
        // (27행) int age3 = 5;였다면 실행결과가 미취학 초등학생 둘 다 출력된다. 두 조건 모두 만족하기 때문이다.
        // 따라서 (32행)처럼 if문으로만 구성한다면 앞부분을 꼭 작성해야 하고, 주제4처럼 else if를 하면 그 부분을 안 써도 코드 작성이 간편하다.
        // 늘 테스트를 할 때는 경계값, 그리고 잘못 출력되는 부분이 없는지를 꼼꼼하게 살펴봐야겠다. 늘 물음표를 가지고 여러 경우의 수를 고려해보자.
    }
}
