package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age1 = 16;
        String status1;

        if (age1 >= 18) {
            status1 = "성인";
        } else {
            status1 = "미성년자";
        }
        System.out.println("age = " + age1 + " status = " + status1);

        // 삼항 연산자 = 조건 연산자
        int age2 = 18;
        String status2 = (age2 >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age2 + " status = " + status2);
    }
}
