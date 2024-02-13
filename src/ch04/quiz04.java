package ch04;

public class quiz04 {
    public static void main(String[] args) {
                while(true){
                    int num1 = (int) (Math.random() * 6) + 1; //1~6까지의 숫자를 랜덤하게 구해줍니다.
                    int num2 = (int) (Math.random() * 6) + 1; //1~6까지의 숫자를 랜덤하게 구해줍니다.
                            // 이 부분에서 (값1, 값2) 형태로 출력하세요.
                            // 값의 합이 5가 아니면 계속 주사위를 던지고, 값의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
                    System.out.println("(" + num1 + ", " + num2 + ")");

                    if ((num1 + num2) == 5) {
                        break;
                    }
                    /*
                    int num3 = num1 + num2;
                    if (num3 == 5) break;
                    System.out.println("두 주사위 값의 합:" + num3);
                     */
                }
            }
        }



