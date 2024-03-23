package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        // [주제 1] 증감 연산자
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); // 1    // soutv

        a = a + 1;
        System.out.println("a = " + a); // 2    // soutv

        // 증감 연산자
        ++a;    // a = a + 1;
        System.out.println("a = " + a); // 3    // soutv
        ++a;
        System.out.println("a = " + a); // 4    // soutv

        // [Tip] Mac기준 control+R은 마지막 실행한 걸 실행시킴. 그래서 이거 실행 안 될 수 있음
        // [단축키] Mac기준 control+Shift+F10. 아니면 그냥 5행 main 옆 초록 재생 버튼 누르면 됨. 후자가 나을 듯

        // [주제 2] 전위 증감 연산자 사용 예
        int c = 1;
        int d = 0;

        d = ++c;    // c의 값을 먼저 증가시키고(c=2), 그 결과를 d에 대입(d=2)
        System.out.println("c = " + c + ", d = " + d);  // 실행결과: c = 2, d = 2

        // 후위 증감 연산자 사용 예
        c = 1;  // c 값을 다시 1로 지정
        d = 0;  // d 값을 다시 0으로 지정

        d = c++;    // c의 현재 값을 d에 먼저 대입하고(d=1), 그 후 c 값을 증가시킴(c=2) (순서가 다른 거야)
        System.out.println("c = " + c + ", d = " + d);  // 실행결과: c = 2, d = 1

        // 이거랑 위랑은 다르다! 대입연산자 있으면 뭘 먼저 증가시킬지 순서가 있는데, 39,40행은 그냥 자기자신 증가시키는 거다
        ++c;
        System.out.println("c = " + c); // 3
        c++;
        System.out.println("c = " + c); // 4    // soutv한 후 변수만 d에서 c로 변경 -> 자동완성되네

        /*
        느낀 점
        39~42행이 익숙하다보니 전위연산자, 후위연산자가 순서가 있다는 게, 값이 다르게 나온다는 게
        1학년때는 어렵게 느껴졌던 기억이 난다. 가만히 차분하게 생각해보면 충분히 이해할 수 있을 텐데
        대입연산자가 있고 없고를 생각 못 했던 거 같다. 이번에 자바 강의를 여러번 복습하면서 확실히 알게 됐다.
         */
    }
}