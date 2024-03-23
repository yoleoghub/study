package variable.ex;

public class VarEx3 {
    // long 타입 변수 선언하고 그 변수를 백억으로 초기화한 후 출력하는 프로그램 작성해라.
    // boolean 타입 변수 선언하고 그 변수를 true로 초기화한 후 출력하는 프로그램 작성해라

    // 답 안 보고 작성
    public static void main(String[] args) {
        long tenBillion = 10000000000L;
        boolean b = true;

        System.out.println(tenBillion);
        System.out.println(b);
    }

    // 정답 (단축어 v는 value를 의미)
    /*
    public static void main(String[] args) {
        long longVar = 10000000000L;
        //System.out.println("longVar = " + longVar); // [단축어] soutv: System.out.println("longVar = " + longVar); 출력됨
        System.out.println(longVar);    // 그냥 단축어 sout만 쓰는 걸로 작성함(21행은 단축어 새로 알려주려고 실습해보신 것 같다)

        boolean booleanVar = true;
        System.out.println(booleanVar); // 여긴 그냥 단축어 sout만 쓰고 변수 직접 작성함
    }
     */
}
