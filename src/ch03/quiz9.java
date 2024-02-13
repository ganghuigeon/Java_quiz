package ch03;

public class quiz9 {
    public static void main(String[] args) {
        //변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 알맞은 코드를 작성하시오.(삼항연산자 이용)
        //내가 입력한 답
        int num = 0;
        String result = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0");
        System.out.println(result);

        /*
        다른 방법으로 출력할 수 있는 방법
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력: ");
        int num = scanner.nextInt();

        //조건 3개 이상 -> 삼항 연산자 중첩
        System.out.println(num > 0 ? "양수": (num < 0 ? "음수": "0"))
        */

    }
}
