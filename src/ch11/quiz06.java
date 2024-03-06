package ch11;

public class quiz06 {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;

        for (int i = 0; i <= 2 ; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);
            }
        }

        //Array의 배열 값은 0,1,2,3,4,5.... 현재 보유한 배열 값은 0,1
        //int value의 값은 0(배열 0번째인 10의 값을 가지고 있음)
        // 숫자형 변수 i의 값이 2와 같거나 클때까지 1씩 더함
        // value는 int로 형변환한 strarray 값을 가진다.
        // array의 값은 인덱스를 초과하거나 배열이 가진 값이 숫자가 아닐때 예외처리가 발생함
        // value는 무조건 실행되어야 한다.


        // 10 출력 catch 두번째인 인덱스 1열의 값을 숫자로 변환할 수 없다는 코드가 출력된 이후,또 10값이 출력되고
        // i값이 2와 같아졌으나 배열의 값에 2에 해당하는 값이 없으므로 인덱스를 초과했음 값이 출력된 후 마지막으로 10이 출력되고 종료됨

    }
}
