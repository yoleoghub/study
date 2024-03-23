package variable;

public class Var1 {

    public static void main(String[] args) {    // [단축키] Mac은 control버튼+R하면 Run 가능
        // [주제 1] 변수 선언, 값 대입, 값 변경, 선언과 초기화
        /*  3번 출력이 아닌 100번 이상 출력이라면 100번 수정해야 하는 한계. 변수의 필요성!
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
         */

        // (1) 변수 선언과 초기화 각각 따로
        int aa;  // 변수 선언(그릇을 만든다고 생각=데이터 저장소)
        aa = 20; // 변수 초기화(그릇에 값을 넣는다(고 생각=값을 대입) a(20)

        System.out.println(aa);
        System.out.println(aa);

        aa = 50;
        System.out.println(aa);  // 변수 값 변경 a(20 -> 50)       // 47행 a와 중복 없애려고 14행부터 a를 aa로 변경

        int bb;                                                 // 48행 b와 중복 없애려고 b를 bb로 변경
        int cc, dd;   // 변수 4개(a,b,c,d)가 메모리 공간을 차지할 것    // 49행 c, 50행 d와 중복 없애려고 c를 cc, d를 dd로 변경

        // (2) 변수 선언과 초기화 한번에
        int ee = 2;                                             // 50행 e와 중복 없애려고 e를 ®ee로 변경
        System.out.println(ee);

        // (3) 여러 변수 선언과 초기화 한번에
        int f = 3, g = 4;
        System.out.println(f);
        System.out.println(g);

        /*
        int h;
        System.out.println(h);
        //변수는 반드시 초기화하고 사용해야 한다. 초기화하지 않고 사용하면 컴파일 에러 발생. 실행 자체가 X. 컴파일 안 됐으니 out폴더에도 Var1 없을 것
        //java: variable h might not have been initialized
        //예를 들어 누군가 게임을 하는 동안 게임은 메모리의 어떤 공간을 차지하고 있었다. 게임을 종료해도 메모리에 바로 그 게임이 안 사라질 수도 있음
        //그런데 그 공간에 변수가 들어와버린 것. 그러면 이상한 값이 출력될 수 있으니 오류 발생됨
        // [Tip] 컴파일 오류 시 7:28의 의미: 7행의 28번째 칸 <- 오류 발생 지점
        // [Tip] 컴파일 에러 발생 지점에 주석 처리 필수. (out엔 Var1 있을 것.) 안 그러면 다른 파일 실행해도 컴파일 에러때문에 실행 안 될 수 있음
         */

        // [주제 2] 변수 타입
        int a = 100;                // 정수
        double b = 10.5;            // 실수
        boolean c = true;           // 불리언(boolean) true, false 입력 가능(컴퓨터가 0,1로 구성돼있음. 이런 타입도 존재함)
        char d = 'A';               // 문자 하나. 'AA'와 같이 문자 2개 이상 입력 시 오류 발생 유의
        String e = "Hello Java";    // 문자열. 문자열을 다루기 위한 특별한 타입(유일하게 대문자로 시작)
        //int z = "zero";             // 52:17, java: incompatible types: java.lang.String cannot be converted to int

        System.out.println(a);       // [단축키] Mac기준 Command+D: Ctrl+C, Ctrl+V도 줄이고 싶을 때®
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 리터럴: 47행의 100, 48행의 10.5같이 변수에 넣은 값. 값들을 리터럴이라고 부른다

        // 개인적으로 궁금해서 찾아본 것: Process finished with exit code 0
        // 프로그램이 오류 없이 정상적으로 잘 실행된 경우에 뜨는 것이라고 한다.
    }
}