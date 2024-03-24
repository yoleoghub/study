package cond.ex;

public class MovieRateEx {
    /*
    평점에 따른 영화 추천하기(요청한 평점 이상의 영화를 찾아서 추천하는 프로그램 작성
    어바웃 타임 - 평점 9 토이 스토리 - 평점 8 고질라 - 평점 7
    평점 변수는 double rating 을 사용하세요. if문을 활용해서 문제 풀가
     */

    // 직접 풀이
    public static void main(String[] args) {
        double rating = 9.7;

        if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else if (rating >= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        } else if (rating >= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
    // [단축키] 범위 지정한 후에 Command+D하면 그 범위가 복사됨 ex) 18-20행 범위지정 후 단축키 누르면 그 범위 전체 복붙

    /*
    // 정답   // 여러 개가 추천돼야 하기 때문에 if문을 서로 다 다른 if문을 써야 된다!!
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating >= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating >= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
     */

    // 느낀 점: 출제자 의도가 '모두' 출력되게 한다는 점을 생각했다면 단독 if문을 써서 독립조건을 모두 만족하게 할 수 있었을 것!
}
