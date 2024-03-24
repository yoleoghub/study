package cond.ex;

public class DistanceEx {
    /*
    거리에 따른 운송 수단 선택하기
    주어진 거리에 따라 가장 적합한 운송 수단 선택하는 프로그램 작성.
    거리가 1km 이하이면: "도보" 10km 이하이면: "자전거" 100km" 이하이면 "자동차" 100km 초과이면: "비행기"
    거리는 변수(int distance)로 지정하고, 해당 변수 기반으로 운송 수단 출력
     */

    // 답 안 보고 작성
    public static void main(String[] args) {
        int distance = 20;

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }

    // 정답
    /*
    public static void main(String[] args) {
        int distance = 80;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
     */
}
