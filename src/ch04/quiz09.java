package ch04;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        //1과 100사이의 임의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;  //사용자 입력을 저장할 공간
        int count = 0;  //시도 횟수를 세기위한 변수


        //화면 입력을 받기 위해 Scanner 클래스 사용
        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");

            input = scanner.nextInt(); //입력받은 값을 변수에 저장한다.

            if(answer > input) {
                System.out.println("큰 값, 필요하다.");
            } else if (answer < input) {
                System.out.println("작은 값, 필요하다");
            }else {
                System.out.println("잘했다. 나아가라.");
                System.out.println("재시도횟수 : " + count );
                break;
            }
        } while (true);

    }
}
