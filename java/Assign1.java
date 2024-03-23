package operator;

public class Assign1 {
    // 주석 입력하려다가 실수로 Shift 2번 눌렀는데 그동안 작업한 파일들 한눈에 볼 수 있네!
    // 대입 연산자
    public static void main(String[] args) {
        int a = 5;
        // 이해하는 방법: +를 먼저하고 =. 즉 a에 3을 먼저 더하고, 그 결과를 a에 대입해라
        a += 3;     // 8 (5 + 3): a = a + 3
        a -= 2;     // 6 (8 - 2): a = a - 2
        a *= 4;     // 24 (6 * 4): a = a * 4
        a /= 3;     // 8 (24 / 3): a = a / 3
        a %= 5;     // 3 (8 % 5): a = a % 5
        System.out.println(a);  // 최종 출력 결과는 3
    }
}
