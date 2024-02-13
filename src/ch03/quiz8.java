package ch03;

public class quiz8 {
    public static void main(String[] args) {
        //정수 연산의 결과는 정수이다. 반드시 기억할 것
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        //내가 작성한 답, 하드코딩이므로 좀 더 유연하게 작동할 수 있도록 설계하는 것이 바람직함
        int numOfBucket = ((numOfApples / sizeOfBucket) + 1);
        /*
        실제 답
        numofBucket = numofApples / 10 + (numofApples % sizeofBucket > 0 ? 1 : 0); 12의 값이 도출되고, 그 중 사과 갯수가 남는다면 1을 더해서 출력해라.
        */
        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }
}

